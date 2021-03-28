
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Player {
    private int highestScore = 0;
    private int currentScore = 0;
    List<Integer> scoreHistory = new ArrayList<>();

    public void setHighestScore(ArrayList scoreHistory){
        this.highestScore = (int) Collections.max(scoreHistory);
    }
    public int getHighestScore() {
        return highestScore;
    }
    public List getScoreHistory(){
        return this.scoreHistory;
    }
    public void addToScoreHistory(int currentScore){
        this.scoreHistory.add(currentScore);
    }
    public void setCurrentScore(int score){
        this.currentScore = score;
    }
}
