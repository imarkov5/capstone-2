import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    
}
