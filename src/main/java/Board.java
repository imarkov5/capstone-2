import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Board {
    private ArrayList<Word> words = new ArrayList(Arrays.asList(Word.values()));

    private static Board board = new Board();
    public static Board getInstance(){
        return board;
    }

    public ArrayList getWords() {
        return this.words;
    }

    public char[] wordToChar() {
        return words.get(0).toString().toCharArray();
    }

    public char[] hideWord() {
        return null;
    }
}
