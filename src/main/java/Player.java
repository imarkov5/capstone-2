
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Player {
    private int highestScore = 0;
    private double averageScore = 0;
    List<Integer> scoreHistory = new ArrayList<>();

    public int getHighestScore() {
        this.highestScore = Collections.max(scoreHistory);
        return highestScore;
    }
    public void addToScoreHistory(int currentScore){
        this.scoreHistory.add(currentScore);
    }

    public void setAverageScore(){
        this.averageScore = (double)(scoreHistory.stream().reduce(0,(accum, num) -> accum + num))/scoreHistory.size();
    }

    public double getAverageScore() {
        return averageScore;
    }
}
