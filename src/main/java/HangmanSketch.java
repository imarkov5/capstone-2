public class HangmanSketch {
    private static HangmanSketch hangmanSketch = new HangmanSketch();
    public static HangmanSketch getInstance() {

        return hangmanSketch;
    }

    public String drawHangman(int mistakesLeft) {
        String hangmanState;
        if(mistakesLeft == 6){
            return hangmanState = "     ________\n" +
                    "     |/     |\n" +
                    "     |      |\n" +
                    "     |     \n"+
                    "     |       \n"+
                    "     |      \n" +
                    "     |      \n"+
                    "     |\n"        +
                    " ____|____";
        }else if(mistakesLeft == 5){
            return hangmanState = "     ________\n" +
                    "     |/     |\n" +
                    "     |      \n" +
                    "     |     \n"+
                    "     |       \n"+
                    "     |      \n" +
                    "     |      \n"+
                    "     |\n"        +
                    " ____|____";
        }else if(mistakesLeft == 4){
            return hangmanState = "     ________\n" +
                    "     |/     |\n" +
                    "     |      |\n" +
                    "     |     (_)\n"+
                    "     |     /  \n"+
                    "     |      \n" +
                    "     |      \n"+
                    "     |\n"        +
                    " ____|____";
        }else if(mistakesLeft == 3){
            return hangmanState = "     ________\n" +
                    "     |/     |\n" +
                    "     |      |\n" +
                    "     |     (_)\n"+
                    "     |     / \\ \n"+
                    "     |      \n" +
                    "     |      \n"+
                    "     |\n"        +
                    " ____|____";
        }else if(mistakesLeft == 2){
            return hangmanState = "     ________\n" +
                    "     |/     |\n" +
                    "     |      |\n" +
                    "     |     (_)\n"+
                    "     |     /|\\ \n"+
                    "     |      |\n" +
                    "     |      \n"+
                    "     |\n"        +
                    " ____|____";
        }else if(mistakesLeft == 1){
            return hangmanState = "     ________\n" +
                    "     |/     |\n" +
                    "     |      |\n" +
                    "     |     (_)\n"+
                    "     |     /|\\ \n"+
                    "     |      |\n" +
                    "     |     / \n"+
                    "     |\n"        +
                    " ____|____";
        }else{
            return hangmanState = "     ________\n" +
                    "     |/     |\n" +
                    "     |      |\n" +
                    "     |     (_)\n"+
                    "     |     /|\\ \n"+
                    "     |      |\n" +
                    "     |     / \\\n"+
                    "     |\n"        +
                    " ____|____";
        }
    }

//    public String drawHangman(int mistakesLeft) {
//        switch(mistakesLeft){
//            case 0:
//                return "     ________\n" +
//                    "     |/     |\n" +
//                    "     |      |\n" +
//                    "     |     (_)\n"+
//                    "     |     /|\\ \n"+
//                    "     |      |\n" +
//                    "     |     / \\\n"+
//                    "     |\n"        +
//                    " ____|____";
//            case 1:
//                return "     ________\n" +
//                    "     |/     |\n" +
//                    "     |      |\n" +
//                    "     |     (_)\n"+
//                    "     |     /|\\ \n"+
//                    "     |      |\n" +
//                    "     |     / \n"+
//                    "     |\n"        +
//                    " ____|____";
//            case 2:
//                return "     ________\n" +
//                        "     |/     |\n" +
//                        "     |      |\n" +
//                        "     |     (_)\n"+
//                        "     |     /|\\ \n"+
//                        "     |      |\n" +
//                        "     |      \n"+
//                        "     |\n"        +
//                        " ____|____";
//            case 3:
//                return "     ________\n" +
//                        "     |/     |\n" +
//                        "     |      |\n" +
//                        "     |     (_)\n"+
//                        "     |     / \\ \n"+
//                        "     |      \n" +
//                        "     |      \n"+
//                        "     |\n"        +
//                        " ____|____";
//            case 4:
//                return "     ________\n" +
//                        "     |/     |\n" +
//                        "     |      |\n" +
//                        "     |     (_)\n"+
//                        "     |     /  \n"+
//                        "     |      \n" +
//                        "     |      \n"+
//                        "     |\n"        +
//                        " ____|____";
//            case 5:
//                return "     ________\n" +
//                        "     |/     |\n" +
//                        "     |      |\n" +
//                        "     |     (_)\n"+
//                        "     |       \n"+
//                        "     |      \n" +
//                        "     |      \n"+
//                        "     |\n"        +
//                        " ____|____";
//            case 6:
//                return "     ________\n" +
//                        "     |/     |\n" +
//                        "     |      \n" +
//                        "     |     \n"+
//                        "     |       \n"+
//                        "     |      \n" +
//                        "     |      \n"+
//                        "     |\n"        +
//                        " ____|____";
//            default:
//                return "     ________\n" +
//                        "     |/     |\n" +
//                        "     |      |\n" +
//                        "     |     \n"+
//                        "     |       \n"+
//                        "     |      \n" +
//                        "     |      \n"+
//                        "     |\n"        +
//                        " ____|____";
//        }
//
//    }
}
