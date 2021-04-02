
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Player {
    private int HIGHEST_SCORE = 0;
    private double AVERAGE_SCORE = 0;
    List<Integer> scoreHistory = new ArrayList<>();

    private static final Player player = new Player();
    private Player(){};
    public static Player getInstance(){return player;};

    public int getHighestScore(){
        if(scoreHistory.size() == 0){
            return this.HIGHEST_SCORE = 0;
        }else{
            return this.HIGHEST_SCORE = Collections.max(scoreHistory);
        }
    }

    public void addToScoreHistory(int currentScore){
        this.scoreHistory.add(currentScore);
    }

    public void setAverageScore(){
        if(scoreHistory.size() == 0){
            this.AVERAGE_SCORE = 0;
        }else{
            this.AVERAGE_SCORE = (double)(scoreHistory.stream().reduce(0,(accum, num) -> accum + num))/scoreHistory.size();
        }
    }

    public double getAverageScore() {
        return AVERAGE_SCORE;
    }
}
