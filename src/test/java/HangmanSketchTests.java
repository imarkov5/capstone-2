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
//    @Test
//    public void printTableau(){
//        String word = "LUCK";
//        List guesses = new ArrayList();
//        String letter1 = "L";
//        String letter2 = "U";
//        guesses.add(letter1);
//        guesses.add(letter2);
//        int expected = 2;
//        int actual = Game.printTableau(word,guesses);
//        Assertions.assertEquals(expected, actual);
//    }
}
