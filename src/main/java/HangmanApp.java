import java.io.IOException;

public class HangmanApp {


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("\n\n\n");
        String fileName = "averageScore";
        AverageScoreWriter averageScoreWriter = new AverageScoreWriter();
        averageScoreWriter.readLastAverageScore(fileName);
        Board.getInstance().playGame(Board.getInstance().getRandomWord());

    }
}
