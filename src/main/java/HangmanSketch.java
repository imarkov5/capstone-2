public class HangmanSketch {
    private static HangmanSketch hangmanSketch = new HangmanSketch();
    public static HangmanSketch getInstance() {

        return hangmanSketch;
    }

    public String drawHangman(int mistakesLeft) {
        String hangmanState;
        if(mistakesLeft == 6){
            return hangmanState = "\n\n" +
                    "                                                                                 __________\n" +
                    "                                                                                |X|//     |\n" +
                    "                                                                                |X|       |\n" +
                    "                                                                                |X|     \n"+
                    "                                                                                |X|       \n"+
                    "                                                                                |X|      \n" +
                    "                                                                                |X|      \n"+
                    "                                                                                |X|\n"        +
                    "                                                                          ZZZZZZZZZZZZZZZ\n\n\n";
        }else if(mistakesLeft == 5){
            return hangmanState = "\n\n" +
                    "                                                                                 __________\n" +
                    "                                                                                |X|//     |\n" +
                    "                                                                                |X|       |\n" +
                    "                                                                                |X|     (oo)\n"+
                    "                                                                                |X|       \n"+
                    "                                                                                |X|      \n" +
                    "                                                                                |X|      \n"+
                    "                                                                                |X|\n"        +
                    "                                                                          ZZZZZZZZZZZZZZZ\n\n\n";
        }else if(mistakesLeft == 4){
            return hangmanState = "\n\n" +
                    "                                                                                __________\n" +
                    "                                                                               |X|//     |\n" +
                    "                                                                               |X|       |\n" +
                    "                                                                               |X|     (oo)\n"+
                    "                                                                               |X|      / \n"+
                    "                                                                               |X|      \n" +
                    "                                                                               |X|      \n"+
                    "                                                                               |X|\n"        +
                    "                                                                         ZZZZZZZZZZZZZZZ\n\n\n";
        }else if(mistakesLeft == 3){
            return hangmanState = "\n\n" +
                    "                                                                                __________\n" +
                    "                                                                               |X|//     |\n" +
                    "                                                                               |X|       |\n" +
                    "                                                                               |X|     (oo)\n"+
                    "                                                                               |X|      / \\\n"+
                    "                                                                               |X|      \n" +
                    "                                                                               |X|      \n"+
                    "                                                                               |X|\n"        +
                    "                                                                         ZZZZZZZZZZZZZZZ\n\n\n";
        }else if(mistakesLeft == 2){
            return hangmanState = "\n\n" +
                    "                                                                               __________\n" +
                    "                                                                              |X|//     |\n" +
                    "                                                                              |X|       |\n" +
                    "                                                                              |X|     (oo)\n"+
                    "                                                                              |X|      /|\\\n"+
                    "                                                                              |X|       |\n" +
                    "                                                                              |X|      \n"+
                    "                                                                              |X|\n"        +
                    "                                                                        ZZZZZZZZZZZZZZZ\n\n\n";
        }else if(mistakesLeft == 1){
            return hangmanState = "\n\n" +
                    "                                                                               __________\n" +
                    "                                                                              |X|//     |\n" +
                    "                                                                              |X|       |\n" +
                    "                                                                              |X|     (00)\n"+
                    "                                                                              |X|      /|\\\n"+
                    "                                                                              |X|       |\n" +
                    "                                                                              |X|      /\n"+
                    "                                                                              |X|\n"        +
                    "                                                                        ZZZZZZZZZZZZZZZ\n\n\n";
        }else{
            return hangmanState = "\n\n" +
                    "                                                                               __________\n" +
                    "                                                                              |X|//     |\n" +
                    "                                                                              |X|       |\n" +
                    "                                                                              |X|      (xx)\n"+
                    "                                                                              |X|      /|\\\n"+
                    "                                                                              |X|       |\n" +
                    "                                                                              |X|      / \\\n"+
                    "                                                                              |X|\n"        +
                    "                                                                        ZZZZZZZZZZZZZZZ\n\n\n";
        }
    }

}
