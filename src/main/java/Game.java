import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Game {
    private final ArrayList<Word> words = new ArrayList(Arrays.asList(Word.values()));
    private int MISTAKES_LEFT = 6;
    private final int MAX_MISTAKES = 6;
    private final int MAX_SCORE = 21;
    private boolean isGameOver = false;
    private final List<Character> guesses = new ArrayList<>();
    protected Scanner key = new Scanner(System.in);
    private Player player = Player.getInstance();


    public Word getRandomWord() throws IOException {
        while(words.size() == 0){
            writeScoresToRepo();
            System.out.println(ColorFont.ANSI_YELLOW.code+"SORRY, I RAN OUT OF WORDS :(");
            System.exit(0);
        }
        Word randomWord = words.get((int) (Math.random() * words.size()));
        words.remove(randomWord);
        return randomWord;

    }

    public void playGame(Word randomWord) throws IOException {
        String word = randomWord.toString();
        System.out.println(ColorFont.ANSI_WHITE.code+ FunFont.GUESS.phrase + ColorFont.ANSI_MAGENTA.code + "" +
                "\n\n**********  " + randomWord.description + " (" + word.length() + " letters)  **********\n\n\n" + ColorFont.ANSI_RESET.code);
        int score = MAX_SCORE;
        printTableau(word, guesses);
        while (!isGameOver) {
            if (MISTAKES_LEFT <= 0) {
                player.addToScoreHistory(score);
                player.setAverageScore();
                System.out.println(ColorFont.ANSI_RED.code+ FunFont.GAME_OVER.phrase +
                        "The word was "+ randomWord.name() + ColorFont.ANSI_BLUE.code + "\n\nYour HIGHEST SCORE: " + player.getHighestScore() + "\nAVERAGE SCORE: " + String.format("%.2f", player.getAverageScore()));
                isGameOver = true;
                restartOrQuitGame();
                break;
            }
            if (!getGuess(key, word, guesses)) {
                MISTAKES_LEFT--;
                score -= MAX_MISTAKES - MISTAKES_LEFT;
            }
            if (printTableau(word, guesses) == word.length()) {
                player.addToScoreHistory(score);
                player.setAverageScore();
                System.out.println(ColorFont.ANSI_PURPLE.code + FunFont.WIN.phrase +
                        ColorFont.ANSI_BLUE.code + "CURRENT SCORE: " + score + "\n\nHighest SCORE: " + player.getHighestScore() + "\nAverage Score: " + String.format("%.2f", player.getAverageScore()));
                isGameOver = true;
                restartOrQuitGame();
                break;
            }
            String hangmanState = HangmanSketch.getInstance().drawHangman(MISTAKES_LEFT);
            System.out.println(ColorFont.ANSI_RED.code + hangmanState + ColorFont.ANSI_YELLOW.code +"\n\nMISTAKES LEFT: "+ MISTAKES_LEFT);
            System.out.println(ColorFont.ANSI_BLUE.code + "CURRENT SCORE: " + score + "\n\n\n");
        }
    }

    public void restartOrQuitGame() throws IOException {

        System.out.println(ColorFont.ANSI_GREEN.code + "\n\nPress 1 to PLAY again | Press 2 to QUIT");
        String letter = key.nextLine();
        if (Character.isDigit(letter.charAt(0)) && letter.length() == 1) {
            if(letter.charAt(0) == '1'){
                isGameOver = false;
                guesses.clear();
                MISTAKES_LEFT = 6;
                playGame(getRandomWord());
            }else if(letter.charAt(0) == '2'){
                writeScoresToRepo();
                System.out.println(ColorFont.ANSI_MAGENTA.code+FunFont.SEE_YOU_SOON.phrase);
                System.exit(0);
            }else{
                restartOrQuitGame();
            }
        } else {
            restartOrQuitGame();
        }
    }

    public static boolean getGuess(Scanner key, String word, List<Character> guesses) {
        System.out.println(ColorFont.ANSI_GREEN.code + FunFont.ENTER_LETTER.phrase);
        String letter = key.nextLine().toUpperCase();
        if(checkForValidInput(letter, key)) {
            guesses.add(letter.charAt(0));
            System.out.print(ColorFont.ANSI_WHITE.code + "LETTERS USED: " + ColorFont.ANSI_CYAN.code);
            guesses.stream().forEach(System.out :: print);
            System.out.println("\n\n");
        }
        return word.contains(letter);
    }

    public static int printTableau(String word, List guesses) {
        int countRightGuesses = 0;
        System.out.print("                                                                                                                                                               ");
        for(int i = 0; i < word.length(); i++){
            if(guesses.contains(word.charAt(i))){
                System.out.print(" "+ word.charAt(i)+ " ");
                countRightGuesses++;
            }else{
                System.out.print(ColorFont.ANSI_RED.code + " - " + ColorFont.ANSI_BLUE.code);
            }
        }
        System.out.println("\n");
        return countRightGuesses;
    }

    public static boolean checkForValidInput(String letter, Scanner key) {
        while(letter.length() != 1 || Character.isDigit(letter.charAt(0)) || (!(letter.charAt(0) >= 'A' && letter.charAt(0) <= 'Z') && !(letter.charAt(0) >= 'a' && letter.charAt(0) <= 'z'))){
            System.out.println(ColorFont.ANSI_YELLOW.code + "Invalid input. Please enter a letter");
            letter = key.nextLine().toUpperCase();
        }
        return true;
    }

    void writeScoresToRepo() throws IOException {
        ScoreRepository scoreRepo = new ScoreRepository();
        scoreRepo.setAverageScore(player.getAverageScore());
        scoreRepo.setHighestScore(player.getHighestScore());
        ScoreWriter writer = new ScoreWriter();
        writer.writeAverageScore(scoreRepo, "scoresRepo");
    }

    public static void readLastScores() throws IOException, ClassNotFoundException {
        String fileName = "scoresRepo";
        ScoreWriter scoreWriter = new ScoreWriter();
        scoreWriter.readLastAverageScore(fileName);
    }
}
