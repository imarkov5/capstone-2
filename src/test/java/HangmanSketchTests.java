import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HangmanSketchTests {
    @Test
    public void drawHangmanZeroMistakesLeftTest(){

        String expected = "\n\n" +
                "                                                                               __________\n" +
                "                                                                              |X|//     |\n" +
                "                                                                              |X|       |\n" +
                "                                                                              |X|      (xx)\n"+
                "                                                                              |X|      /|\\\n"+
                "                                                                              |X|       |\n" +
                "                                                                              |X|      / \\\n"+
                "                                                                              |X|\n"        +
                "                                                                        ZZZZZZZZZZZZZZZ\n\n\n";
        String actual = HangmanSketch.getInstance().drawHangman(0);
        Assertions.assertEquals(expected, actual);
    }
}
