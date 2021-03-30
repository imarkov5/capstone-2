import java.io.*;

public class ScoreWriter {


    public void writeAverageScore(ScoreRepository averageScoreRepo, String fileName) throws IOException {
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(averageScoreRepo);
        fos.close();
        oos.close();
    }

    public ScoreRepository readLastAverageScore(String fileName) throws IOException, ClassNotFoundException{
        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object obj = ois.readObject();
        fis.close();
        ois.close();
        ScoreRepository averageScoreDeserialized = (ScoreRepository)obj;
        System.out.println(ColorFont.ANSI_BLUE.code + "Your last scores: " + averageScoreDeserialized);
        return averageScoreDeserialized;
    }
}
