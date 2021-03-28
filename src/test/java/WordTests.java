import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

public class WordTests {
    char[] charWord = {'I','N','H','E','R','I','T','A','N','C','E'};
    @Test
    public void getWordTest(){
        String expected = "INHERITANCE";
        String actual = Board.getInstance().getWords().get(0).toString();
        Assertions.assertEquals(expected, actual);
    }
//    @Test
//    public void wordToCharTest(){
//        boolean expected = true;
//        boolean actual = Arrays.equals(Board.getInstance().wordToChar(), charWord);
//        Assertions.assertEquals(expected, actual);
//    }
//    @Test
//    public void hideWordTest(){
//        char[] hiddenWord = {'X','X','X','X','X','X','X','X','X','X','X'};
//        boolean expected = true;
//        boolean actual = Arrays.equals(hiddenWord, Board.getInstance().hideWord(charWord));
//        Assertions.assertEquals(expected, actual);
//    }
    
}
