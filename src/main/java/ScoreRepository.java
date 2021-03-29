
import java.io.Serializable;
import java.util.Date;

public class ScoreRepository implements Serializable {
    private double averageScore;
    private Date date;

    public ScoreRepository() {
        this.date = new Date();
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "" + averageScore +
                " on " + date +
                "";
    }
}
