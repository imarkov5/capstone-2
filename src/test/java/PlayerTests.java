import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class PlayerTests {

    @Test
    public void getAverageScoreTest(){
        Player.getInstance().addToScoreHistory(20);
        Player.getInstance().addToScoreHistory(11);
        Player.getInstance().addToScoreHistory(11);
        Player.getInstance().setAverageScore();
        Double expected = 14.0;
        Double actual = Player.getInstance().getAverageScore();
        Assertions.assertEquals(expected, actual);
    }
    public void getHighestScoreTest(){
        Player.getInstance().addToScoreHistory(21);
        Player.getInstance().addToScoreHistory(6);
        Player.getInstance().addToScoreHistory(11);
        int expected = 21;
        int actual = Player.getInstance().getHighestScore();
        Assertions.assertEquals(expected, actual);
    }

    
}
