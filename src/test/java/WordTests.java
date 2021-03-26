import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class WordTests {
    @Test
    public void getWordTest(){
        String expected = "INHERITANCE";
        String actual = Board.getInstance().getWords().get(0).toString();
        Assertions.assertEquals(expected, actual);
    }
}
