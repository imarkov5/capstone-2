import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class WordTests {
    @Test
    public void getWordTest(){
        String expected = "INHERITANCE";
        String actual = Board.getInstance().getWords().get(0).toString();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void wordToCharTest(){
        char[] charWord = {'i','n','h','e','r','i','t','a','n','c','e'};
        char[] expected = charWord;
        char[] actual = Board.getInstance().wordToChar();
        Assertions.assertEquals(expected, actual);
    }
}
