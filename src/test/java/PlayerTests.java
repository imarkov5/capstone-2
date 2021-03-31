import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlayerTests {

    @Test
    public void getAverageScoreTest(){
        List<Integer> scoreHistory = new ArrayList<>(Arrays.asList(20,11,11));
        Double expected = 14.0;
        Double actual = Player.getInstance().getAverageScore();
        Assertions.assertEquals(expected, actual);
    }

    
}
