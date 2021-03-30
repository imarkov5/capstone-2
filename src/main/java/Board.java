import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Board extends Game{
//    private ArrayList<Word> words = new ArrayList(Arrays.asList(Word.values()));
//    private int mistakesLeft = 6;
//    private int maxMistakes = 6;
//    private int maxScore = 21;
//    private boolean isGameOver = false;
//    private List<Character> guesses = new ArrayList<>();
//    private Scanner key = new Scanner(System.in);
//    private Player player = new Player();


    private static Board board = new Board();

    public static Board getInstance(){
        return board;
    }

//    public ArrayList getWords() {
//        return this.words;
//    }
//
//
//    public Word getRandomWord() {
//        Word randomWord = words.get((int)(Math.random()*words.size()));
//        words.remove(randomWord);
//        return randomWord;
//    }

    public void start() throws IOException {
        System.out.println(ColorFont.ANSI_MAGENTA.code + "\n\n\n" + FunFont.WELCOME.phrase + "\n\n" + ColorFont.ANSI_GREEN.code + FunFont.INSTRUCTIONS.phrase);
        String letter = key.nextLine();
        checkForValidNum(letter);
    }

    private void checkForValidNum(String letter) throws IOException {
        if (Character.isDigit(letter.charAt(0)) && letter.length() == 1) {
            if(letter.charAt(0) == '1'){
                playGame(getRandomWord());
            }else if(letter.charAt(0) == '2'){
                printInstructions();
                playGame(getRandomWord());
            }else{
                System.out.println(ColorFont.ANSI_YELLOW.code + "\n\nPress 1 to play | Press 2 for instructions\n\n\n");
                String letter1 = key.nextLine();
                checkForValidNum(letter1);
            }
        } else {
            System.out.println(ColorFont.ANSI_YELLOW.code + "\n\nPress 1 to play | Press 2 for instructions\n\n\n");
            String letter2 = key.nextLine();
            checkForValidNum(letter2);
        }
    }

    private void printInstructions() {

        try{
            Thread.sleep(1500);
            System.out.println(ColorFont.ANSI_RED.code + "The rules are simple.\n\n");
            Thread.sleep(1000);
            String[] rules1 = {"Your ", "goal ", "is ", "to ", "figure ", "out ", "the ", "word ", "before ", "your ", "man ","gets " ,"hung.\n\n"};
            for(String s : rules1){
                System.out.print(s);
                Thread.sleep(200);
            }
            Thread.sleep(1000);
            String[] rules2 = {"Enter ", "in ", "letters ", "one ", "by ", "one, ", "and ", "the ", "game ", "will ", "tell ", "you ", "which ","ones ","are ","right ","and " ,"wrong.\n\n"};
            for(String s : rules2){
                System.out.print(s);
                Thread.sleep(200);
            }
            Thread.sleep(1000);
            String[] rules3 = {"For ", "an ", "added ", "challenge, ", "you ", "will ", "get ","21 points ","at ", "the ","start ", "of ","the ", "game.\n\n"};
            for(String s : rules3){
                System.out.print(s);
                Thread.sleep(200);
            }
            Thread.sleep(1000);
            String[] rules4 = {"For ", "the ", "first ", "mistake ", "you ", "will ", "lose ","1 point, ","for ","the ","2nd mistake - ","2 points, ","etc; ","possible ","max mistakes - ","6.","\n\n"};
            for(String s : rules4){
                System.out.print(s);
                Thread.sleep(200);
            }
            Thread.sleep(1500);
            String[] rules5 = {"Try ", "to ", "get ", "the ", "highest ", "score ", "possible. ","The ","game ","will ","keep ","track ","of your ","average ","score ", "as well\n\n"};
            for(String s : rules5){
                System.out.print(s);
                Thread.sleep(200);
            }
            Thread.sleep(1500);
            System.out.println("GOOD LUCK!\n");
            Thread.sleep(6000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

//    public void playGame(Word randomWord) throws IOException {
//        String word = randomWord.toString();
//        System.out.println(ColorFont.ANSI_RED.code + ColorBackground.ANSI_BLUE_BACKGROUND.key + FunFont.GUESS.phrase + ColorFont.ANSI_RESET.code + ColorFont.ANSI_MAGENTA.code + "" +
//                "\n\n                                                                                                                                   **********  " + randomWord.description + " (" + word.length() + " letters)  **********\n\n\n" + ColorFont.ANSI_RESET.code);
//        int score = maxScore;
//        printTableau(word, guesses);
//        while (!isGameOver) {
//            if (mistakesLeft <= 0) {
//                player.setAverageScore();
//                System.out.println(ColorFont.ANSI_RED.code+ FunFont.GAME_OVER.phrase +
//                        "The word was "+ randomWord.name() + ColorFont.ANSI_BLUE.code + "\n\nYour HIGHEST SCORE: " + player.getHighestScore() + "\nAVERAGE SCORE: " + player.getAverageScore());
//                isGameOver = true;
//                restartOrQuitGame();
//                break;
//            }
//            if (!getGuess(key, word, guesses)) {
//                mistakesLeft--;
//                score -= maxMistakes - mistakesLeft;
//            }
//            if (printTableau(word, guesses) == word.length()) {
//                player.addToScoreHistory(score);
//                player.setAverageScore();
//                System.out.println(ColorFont.ANSI_PURPLE.code + FunFont.WIN.phrase +
//                        ColorFont.ANSI_BLUE.code + "CURRENT SCORE: " + score + "\n\nHighest SCORE: " + player.getHighestScore() + "\nAverage Score: " + player.getAverageScore());
//                isGameOver = true;
//                restartOrQuitGame();
//                break;
//            }
//            String hangmanState = HangmanSketch.getInstance().drawHangman(mistakesLeft);
//            System.out.println(ColorFont.ANSI_RED.code + hangmanState + ColorFont.ANSI_YELLOW.code +"\n\nMISTAKES LEFT: "+ mistakesLeft);
//            System.out.println(ColorFont.ANSI_BLUE.code + "CURRENT SCORE: " + score + "\n\n\n");
//        }
//    }
//    public void restartOrQuitGame() throws IOException {
//
//        System.out.println(ColorFont.ANSI_GREEN.code + "\n\nPress 1 to PLAY again | Press 2 to QUIT");
//        String letter = key.nextLine();
//        if (Character.isDigit(letter.charAt(0)) && letter.length() == 1) {
//            if(letter.charAt(0) == '1'){
//                isGameOver = false;
//                guesses.clear();
//                mistakesLeft = 6;
//                playGame(getRandomWord());
//            }else if(letter.charAt(0) == '2'){
//                writeScoresToRepo();
//                System.out.println(ColorFont.ANSI_MAGENTA.code+FunFont.SEE_YOU_SOON.phrase);
//            }else{
//                restartOrQuitGame();
//            }
//        } else {
//            restartOrQuitGame();
//        }
//    }

//    void writeScoresToRepo() throws IOException {
//        ScoreRepository scoreRepo = new ScoreRepository();
//        scoreRepo.setAverageScore(player.getAverageScore());
//        scoreRepo.setHighestScore(player.getHighestScore());
//        ScoreWriter writer = new ScoreWriter();
//        writer.writeAverageScore(scoreRepo, "scoresRepo");
//    }

//    public static boolean getGuess(Scanner key, String word, List<Character> guesses) {
//        System.out.println(ColorFont.ANSI_GREEN.code + FunFont.ENTER_LETTER.phrase);
//        String letter = key.nextLine().toUpperCase();
//        if(board.checkForValidInput(letter)) {
//            guesses.add(letter.charAt(0));
//            System.out.print(ColorFont.ANSI_WHITE.code + "LETTERS USED: " + ColorFont.ANSI_RED.code);
//            guesses.stream().forEach(System.out :: print);
//            System.out.println("\n\n");
//        }
//        return word.contains(letter);
//    }
//
//    public static int printTableau(String word, List guesses) {
//        int countRightGuesses = 0;
//        System.out.print("                                                                                                   ");
//        for(int i = 0; i < word.length(); i++){
//            if(guesses.contains(word.charAt(i))){
//                System.out.print(" "+ word.charAt(i)+ " ");
//                countRightGuesses++;
//            }else{
//                System.out.print(ColorFont.ANSI_PURPLE.code + " - " + ColorFont.ANSI_BLUE.code);
//            }
//        }
//        System.out.println("\n");
//        return countRightGuesses;
//    }
//
//    public boolean checkForValidInput(String letter) {
//            while(letter.length() != 1 || Character.isDigit(letter.charAt(0)) || (!(letter.charAt(0) >= 'A' && letter.charAt(0) <= 'Z') && !(letter.charAt(0) >= 'a' && letter.charAt(0) <= 'z'))){
//                System.out.println(ColorFont.ANSI_YELLOW.code + "Invalid input. Please enter a letter");
//                letter = key.nextLine().toUpperCase();
//            }
//            return true;
//    }

}
