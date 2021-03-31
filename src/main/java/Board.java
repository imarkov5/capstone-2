import java.io.IOException;

public class Board extends Game{


    private static Board board = new Board();

    public static Board getInstance(){
        return board;
    }


    public void start() throws IOException {
        System.out.println(ColorFont.ANSI_MAGENTA.code + "\n\n\n" + FunFont.WELCOME.phrase + "\n\n" + ColorFont.ANSI_GREEN.code + FunFont.INSTRUCTIONS.phrase);
        String letter = key.nextLine();
        checkForValidNum(letter);
    }

    private void checkForValidNum(String letter) throws IOException {
        if (Character.isDigit(letter.charAt(0)) && letter.length() == 1) {
            if(letter.charAt(0) == '1'){
                playGame(getRandomWord());
            }else if(letter.charAt(0) == '2'){
                printInstructions();
                playGame(getRandomWord());
            }else{
                System.out.println(ColorFont.ANSI_YELLOW.code + "\n\nPress 1 to play | Press 2 for instructions\n\n\n");
                String letter1 = key.nextLine();
                checkForValidNum(letter1);
            }
        } else {
            System.out.println(ColorFont.ANSI_YELLOW.code + "\n\nPress 1 to play | Press 2 for instructions\n\n\n");
            String letter2 = key.nextLine();
            checkForValidNum(letter2);
        }
    }

    private void printInstructions() {

        try{
            Thread.sleep(1500);
            System.out.println(ColorFont.ANSI_RED.code + "The rules are simple.\n\n");
            Thread.sleep(1000);
            String[] rules1 = {"Your ", "goal ", "is ", "to ", "figure ", "out ", "the ", "word ", "before ", "your ", "man ","gets " ,"hung.\n\n"};
            for(String s : rules1){
                System.out.print(s);
                Thread.sleep(200);
            }
            Thread.sleep(1000);
            String[] rules2 = {"Enter ", "in ", "letters ", "one ", "by ", "one, ", "and ", "the ", "game ", "will ", "tell ", "you ", "which ","ones ","are ","right ","and " ,"wrong.\n\n"};
            for(String s : rules2){
                System.out.print(s);
                Thread.sleep(200);
            }
            Thread.sleep(1000);
            String[] rules3 = {"For ", "an ", "added ", "challenge, ", "you ", "will ", "get ","21 points ","at ", "the ","start ", "of ","the ", "game.\n\n"};
            for(String s : rules3){
                System.out.print(s);
                Thread.sleep(200);
            }
            Thread.sleep(1000);
            String[] rules4 = {"For ", "the ", "first ", "mistake ", "you ", "will ", "lose ","1 point, ","for ","the ","2nd mistake - ","2 points, ","etc; ","possible ","max mistakes - ","6.","\n\n"};
            for(String s : rules4){
                System.out.print(s);
                Thread.sleep(200);
            }
            Thread.sleep(1500);
            String[] rules5 = {"Try ", "to ", "get ", "the ", "highest ", "score ", "possible. ","The ","game ","will ","keep ","track ","of your ","average ","score ", "as well.\n\n"};
            for(String s : rules5){
                System.out.print(s);
                Thread.sleep(200);
            }
            Thread.sleep(1500);
            System.out.println("GOOD LUCK!\n");
            Thread.sleep(6000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
