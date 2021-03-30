
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Player {
    private int highestScore = 0;
    private double averageScore = 0;
    List<Integer> scoreHistory = new ArrayList<>();

    public int getHighestScore(){
        if(scoreHistory.size() == 0){
            return this.highestScore = 0;
        }else{
            return this.highestScore = Collections.max(scoreHistory);
        }
    }
    public void addToScoreHistory(int currentScore){
        this.scoreHistory.add(currentScore);
    }

    public void setAverageScore(){
        if(scoreHistory.size() == 0){
            this.averageScore = 0;
        }else{
            this.averageScore = (double)(scoreHistory.stream().reduce(0,(accum, num) -> accum + num))/scoreHistory.size();
        }
    }

    public double getAverageScore() {
        return averageScore;
    }
}
