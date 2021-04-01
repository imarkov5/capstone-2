import java.io.Serializable;
import java.util.Date;

public class ScoreRepository implements Serializable {
    private double averageScore;
    private int highestScore;
    private Date date;

    public ScoreRepository() {
        this.date = new Date();
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public void setHighestScore(int highestScore) {
        this.highestScore = highestScore;
    }

    @Override
    public String toString() {
        return "AVERAGE score - " + String.format("%.2f", averageScore) + " | HIGHEST score - " + highestScore +
                " | date: " + date +
                "";
    }
}
