import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HangmanTests {
    @Test
    public void drawHangmanZeroMistakesLeftTest(){

        String expected = "     ________\n" +
                          "     |/     |\n" +
                          "     |      |\n" +
                          "     |     (_)\n"+
                          "     |     /|\\ \n"+
                          "     |      |\n" +
                          "     |     / \\\n"+
                          "     |\n"        +
                          " ____|____";
        String actual = Hangman.getInstance().drawHangman(0);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void drawHangmanOneMistakeLeftTest(){

        String expected = "     ________\n" +
                "     |/     |\n" +
                "     |      |\n" +
                "     |     (_)\n"+
                "     |     /|\\ \n"+
                "     |      |\n" +
                "     |     / \n"+
                "     |\n"        +
                " ____|____";
        String actual = Hangman.getInstance().drawHangman(1);
        Assertions.assertEquals(expected, actual);
    }
}
