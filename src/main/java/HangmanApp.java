import java.io.IOException;

public class HangmanApp {


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("\n\n\n");
        Game.readLastScores();
        Board.getInstance().start();

    }


}
