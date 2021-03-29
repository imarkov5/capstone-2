import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Board{
    private ArrayList<Word> words = new ArrayList(Arrays.asList(Word.values()));
    private int mistakesLeft = 6;
    private int maxMistakes = 6;
    private int maxScore = 21;
    private boolean isGameOver = false;
    private List<Character> guesses = new ArrayList<>();
    private Scanner key = new Scanner(System.in);
    private Player player = new Player();




    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";



    private static Board board = new Board();

    public static Board getInstance(){
        return board;
    }

    public ArrayList getWords() {
        return this.words;
    }

    public Word getRandomWord() {
        Word randomWord = words.get((int)(Math.random()*words.size()));
        words.remove(randomWord);
        return randomWord;
    }

    public void startGame() throws IOException {
        System.out.println(ANSI_BLUE + "\n\nLETS PLAY H A N G M A N\n\nPress 1 to play | Press 2 for instructions");
        String letter = key.nextLine();
        if (Character.isDigit(letter.charAt(0)) && letter.length() == 1) {
            if(letter.charAt(0) == '1'){
                playGame(getRandomWord());
            }else if(letter.charAt(0) == '2'){
                printInstructions();
                playGame(getRandomWord());
            }else{
                System.out.println(ANSI_RED + "\n\nPress 1 to play | Press 2 for instructions");
                startGame();
            }
        } else {
            System.out.println(ANSI_RED + "\n\nPress 1 to play | Press 2 for instructions");
            startGame();
        }
    }

    private void printInstructions() {
        try{
            Thread.sleep(1500);
            System.out.println("Objective: guess the word before your man gets hung.");
            Thread.sleep(1500);
            System.out.println("You will get a secret word to guess, a description and gallows");
            Thread.sleep(1500);
            System.out.println("Every wrong answer will draw a part of the man, 6 in total");
            Thread.sleep(1500);
            System.out.println("When the whole man drawn, game is over.");
            Thread.sleep(1500);
            System.out.println("You get 21 points at the beginning of the game.");
            Thread.sleep(1500);
            System.out.println("For every mistake you loose points, 1 for 1st mistake, 2 for 2nd mistake, 3 for 3rd mistake and so forth.");
            Thread.sleep(1500);
            System.out.println("You can play as many games as you'd like.");
            Thread.sleep(1500);
            System.out.println("GOOD LUCK!");
            Thread.sleep(1500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }



    }

    public void playGame(Word randomWord) throws IOException {
        String word = randomWord.toString();
        System.out.println(ANSI_BLUE + "\n\nDescription: " + randomWord.description + " (" + word.length() + " letters)\n");
        int score = maxScore;
        while (!isGameOver) {
            if (mistakesLeft <= 0) {
                player.setAverageScore();
                System.out.println(ANSI_RED + "GAME IS OVER! \n\nYour Highest SCORE: " + player.getHighestScore() + "\nAverage Score: " + player.getAverageScore());
                isGameOver = true;
                restartOrQuitGame();
                break;
            }
            printTableau(word, guesses);
            if (!getGuess(key, word, guesses)) {
                mistakesLeft--;
                score -= maxMistakes - mistakesLeft;
                System.out.println("current score: " + score);
            }
            if (printTableau(word, guesses) == word.length()) {
                player.addToScoreHistory(score);
                player.setAverageScore();
                System.out.println(ANSI_GREEN + "You WON!\n\nYour Current SCORE: " + score + "\n\nHighest SCORE: " + player.getHighestScore() + "\nAverage Score: " + player.getAverageScore());
                isGameOver = true;
                restartOrQuitGame();
                break;
            }
            String hangmanState = HangmanSketch.getInstance().drawHangman(mistakesLeft);
            System.out.println(hangmanState + "\nPossible mistakes left: "+ mistakesLeft);
            System.out.println("current score: " + score);
        }
    }
    public void restartOrQuitGame() throws IOException {

        System.out.println("Play again : press 1; Quit: press 2");
        String letter = key.nextLine();
        if (Character.isDigit(letter.charAt(0)) && letter.length() == 1) {
            if(letter.charAt(0) == '1'){
                isGameOver = false;
                guesses.clear();
                mistakesLeft = 6;
                playGame(getRandomWord());
            }else if(letter.charAt(0) == '2'){
                writeScoresToRepo();
                System.out.println("Thank you for playing! Have a good one!");
            }else{
                restartOrQuitGame();
            }
        } else {
            restartOrQuitGame();
        }
    }

    private void writeScoresToRepo() throws IOException {
        ScoreRepository scoreRepo = new ScoreRepository();
        scoreRepo.setAverageScore(player.getAverageScore());
        scoreRepo.setHighestScore(player.getHighestScore());
        ScoreWriter writer = new ScoreWriter();
        writer.writeAverageScore(scoreRepo, "scoresRepo");
    }

    public static boolean getGuess(Scanner key, String word, List<Character> guesses) {
        System.out.println("Please enter a letter: ");
        String letter = key.nextLine().toUpperCase();
        if(board.checkForValidInput(letter)) {
            guesses.add(letter.charAt(0));
            System.out.print("Letters used: ");
            guesses.stream().forEach(System.out :: print);
            System.out.println();
        }
        return word.contains(letter);
    }

    public static int printTableau(String word, List guesses) {
        int countRightGuesses = 0;
        for(int i = 0; i < word.length(); i++){
            if(guesses.contains(word.charAt(i))){
                System.out.print(word.charAt(i));
                countRightGuesses++;
            }else{
                System.out.print("-");
            }
        }
        System.out.println("\n");
        return countRightGuesses;
    }

    public boolean checkForValidInput(String letter) {
            while(letter.length() != 1 || Character.isDigit(letter.charAt(0)) || (!(letter.charAt(0) >= 'A' && letter.charAt(0) <= 'Z') && !(letter.charAt(0) >= 'a' && letter.charAt(0) <= 'z'))){
                System.out.println("Invalid input. Please enter a letter");
                letter = key.nextLine().toUpperCase();
            }
            return true;
    }

}
