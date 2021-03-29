import java.io.IOException;

public class HangmanApp {


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("\n\n\n");
        String fileName = "scoresRepo";
        ScoreWriter averageScoreWriter = new ScoreWriter();
        averageScoreWriter.readLastAverageScore(fileName);
        Board.getInstance().startGame();

    }
}
