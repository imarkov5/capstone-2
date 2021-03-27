public class Hangman {
    private static Hangman hangman= new Hangman();
    public static Hangman getInstance() {
        return hangman;
    }

    public String drawHangman(int mistakes) {
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
            case 5:
                return "     ________\n" +
                    "     |/     |\n" +
                    "     |      |\n" +
                    "     |     (_)\n"+
                    "     |     /|\\ \n"+
                    "     |      |\n" +
                    "     |     / \n"+
                    "     |\n"        +
                    " ____|____";
            case 4:
                return "     ________\n" +
                        "     |/     |\n" +
                        "     |      |\n" +
                        "     |     (_)\n"+
                        "     |     /|\\ \n"+
                        "     |      |\n" +
                        "     |      \n"+
                        "     |\n"        +
                        " ____|____";
            case 3:
                return "     ________\n" +
                        "     |/     |\n" +
                        "     |      |\n" +
                        "     |     (_)\n"+
                        "     |     / \\ \n"+
                        "     |      \n" +
                        "     |      \n"+
                        "     |\n"        +
                        " ____|____";
            case 2:
                return "     ________\n" +
                        "     |/     |\n" +
                        "     |      |\n" +
                        "     |     (_)\n"+
                        "     |     /  \n"+
                        "     |      \n" +
                        "     |      \n"+
                        "     |\n"        +
                        " ____|____";
            case 1:
                return "     ________\n" +
                        "     |/     |\n" +
                        "     |      |\n" +
                        "     |     (_)\n"+
                        "     |       \n"+
                        "     |      \n" +
                        "     |      \n"+
                        "     |\n"        +
                        " ____|____";
            default:
                return "     ________\n" +
                        "     |/     |\n" +
                        "     |      |\n" +
                        "     |     \n"+
                        "     |       \n"+
                        "     |      \n" +
                        "     |      \n"+
                        "     |\n"        +
                        " ____|____";
        }

    }
}
