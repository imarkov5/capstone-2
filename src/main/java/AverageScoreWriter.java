import java.io.*;

public class AverageScoreWriter {


    public void logAverageScore(AverageScoreRepository averageScoreRepo, String fileName) throws IOException {
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(averageScoreRepo);
        fos.close();
        oos.close();
    }

    public AverageScoreRepository readLastAverageScore(String fileName) throws IOException, ClassNotFoundException{
        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object obj = ois.readObject();
        fis.close();
        ois.close();
        AverageScoreRepository averageScoreDeserialized = (AverageScoreRepository)obj;
        System.out.println("Last Average Score: " + averageScoreDeserialized);
        return averageScoreDeserialized;
    }
}
