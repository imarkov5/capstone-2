import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class WordTests {
    @Test
    public void getWord(){
        String expected = "PUPPY";
        Word actual = Word.PUPPY;
        Assertions.assertEquals(expected, actual);
    }
}
