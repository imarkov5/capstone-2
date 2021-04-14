import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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
    @Test
    public void drawHangmanOneMistakeLeftTest(){

        String expected = "\n\n" +
                "                                                                               __________\n" +
                "                                                                              |X|//     |\n" +
                "                                                                              |X|       |\n" +
                "                                                                              |X|     (00)\n"+
                "                                                                              |X|      /|\\\n"+
                "                                                                              |X|       |\n" +
                "                                                                              |X|      /\n"+
                "                                                                              |X|\n"        +
                "                                                                        ZZZZZZZZZZZZZZZ\n\n\n";
        String actual = HangmanSketch.getInstance().drawHangman(1);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void drawHangmanTwoMistakesLeftTest(){

        String expected = "\n\n" +
                "                                                                               __________\n" +
                "                                                                              |X|//     |\n" +
                "                                                                              |X|       |\n" +
                "                                                                              |X|     (oo)\n"+
                "                                                                              |X|      /|\\\n"+
                "                                                                              |X|       |\n" +
                "                                                                              |X|      \n"+
                "                                                                              |X|\n"        +
                "                                                                        ZZZZZZZZZZZZZZZ\n\n\n";
        String actual = HangmanSketch.getInstance().drawHangman(2);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void drawHangmanThreeMistakesLeftTest(){

        String expected = "\n\n" +
                "                                                                                __________\n" +
                "                                                                               |X|//     |\n" +
                "                                                                               |X|       |\n" +
                "                                                                               |X|     (oo)\n"+
                "                                                                               |X|      / \\\n"+
                "                                                                               |X|      \n" +
                "                                                                               |X|      \n"+
                "                                                                               |X|\n"        +
                "                                                                         ZZZZZZZZZZZZZZZ\n\n\n";
        String actual = HangmanSketch.getInstance().drawHangman(3);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void drawHangmanFourMistakesLeftTest(){

        String expected = "\n\n" +
                "                                                                                __________\n" +
                "                                                                               |X|//     |\n" +
                "                                                                               |X|       |\n" +
                "                                                                               |X|     (oo)\n"+
                "                                                                               |X|      / \n"+
                "                                                                               |X|      \n" +
                "                                                                               |X|      \n"+
                "                                                                               |X|\n"        +
                "                                                                         ZZZZZZZZZZZZZZZ\n\n\n";
        String actual = HangmanSketch.getInstance().drawHangman(4);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void drawHangmanFiveMistakesLeftTest(){

        String expected = "\n\n" +
                "                                                                                 __________\n" +
                "                                                                                |X|//     |\n" +
                "                                                                                |X|       |\n" +
                "                                                                                |X|     (oo)\n"+
                "                                                                                |X|       \n"+
                "                                                                                |X|      \n" +
                "                                                                                |X|      \n"+
                "                                                                                |X|\n"        +
                "                                                                          ZZZZZZZZZZZZZZZ\n\n\n";
        String actual = HangmanSketch.getInstance().drawHangman(5);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void drawHangmanSixMistakesLeftTest(){

        String expected = "\n\n" +
                "                                                                                 __________\n" +
                "                                                                                |X|//     |\n" +
                "                                                                                |X|       |\n" +
                "                                                                                |X|     \n"+
                "                                                                                |X|       \n"+
                "                                                                                |X|      \n" +
                "                                                                                |X|      \n"+
                "                                                                                |X|\n"        +
                "                                                                          ZZZZZZZZZZZZZZZ\n\n\n";
        String actual = HangmanSketch.getInstance().drawHangman(6);
        Assertions.assertEquals(expected, actual);
    }
}
