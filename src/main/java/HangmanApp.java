import java.util.ArrayList;

public class HangmanApp {


    public static void main(String[] args) {


        Board.getInstance().playGame(Board.getInstance().getRandomWord());
    }
}
