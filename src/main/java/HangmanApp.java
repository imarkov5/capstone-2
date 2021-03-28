import java.util.ArrayList;

public class HangmanApp {


    public static void main(String[] args) {

        ArrayList words = Board.getInstance().getWords();

        Word randomWord = Board.getInstance().getRandomWord();

        Board.getInstance().playTheGame(randomWord);
    }
}
