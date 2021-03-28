public interface Game {
    public final int mistakesLeft = 6;

    void wordToChar();
    void hideWord();
    void checkForValidInput();
    void checkIfLetterGuessed();


}
