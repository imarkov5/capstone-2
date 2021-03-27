public class Hangman {
    private static Hangman hangman= new Hangman();
    public static Hangman getInstance() {
        return hangman;
    }

    public String drawHangman(int mistakes) {
        String hangmanDrawing = "";
        switch(mistakes){
            case 6:
            return "     ________\n" +
                    "     |/     |\n" +
                    "     |      |\n" +
                    "     |     (_)\n"+
                    "     |     /|\\ \n"+
                    "     |      |\n" +
                    "     |     / \\\n"+
                    "     |\n"        +
                    " ____|____";
        }
        return hangmanDrawing;
    }
}
