import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Board{
    private ArrayList<Word> words = new ArrayList(Arrays.asList(Word.values()));
    private int mistakesLeft = 6;
    private boolean isWordGuessed = false;
    private List<Character> guesses = new ArrayList<>();
    private Scanner key = new Scanner(System.in);

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
        return randomWord;
    }

    public void playTheGame(Word randomWord) {
        String word = randomWord.toString();
        System.out.println(ANSI_BLUE + "\n\nLETS PLAY H A N G M A N\n\nYou are allowed to make 6 mistakes.\n\n" + randomWord.description + " (" + word.length() + " letters)\n");

        while (!isWordGuessed) {
            if (mistakesLeft <= 0) {
                System.out.println(ANSI_RED + "GAME IS OVER! \n\nThe word was " + word + "\nPlay again? YES - 1, NO - 2");
                break;
            }
            printTableau(word, guesses);
            if (!getGuess(key, word, guesses)) {
                mistakesLeft--;
            }
            if (printTableau(word, guesses) == word.length()) {
                System.out.println(ANSI_RED_BACKGROUND + ANSI_GREEN + "You WON!");
                isWordGuessed = true;
                break;
            }
            String hangmanState = HangmanSketch.getInstance().drawHangman(mistakesLeft);
            System.out.println(hangmanState + "\nPossible mistakes left: "+ mistakesLeft);


        }
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
