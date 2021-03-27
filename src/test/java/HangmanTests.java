import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HangmanTests {
    @Test
    public void drawHangmanTest(){

        String expected = "     ________\n" +
                          "     |/     |\n" +
                          "     |      |\n" +
                          "     |     (_)\n"+
                          "     |     /|\\ \n"+
                          "     |      |\n" +
                          "     |     / \\\n"+
                          "     |\n"        +
                          " ____|____";
        String actual = Hangman.getInstance().drawHangman(6);
        Assertions.assertEquals(expected, actual);
    }
}
