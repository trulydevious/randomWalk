package RandomWalk;

import RandomWalk.RandomWalk;
import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class TestRandomWalk {

    public static void exportData(String path, ArrayList<RandomWalk> randomWalks){
        File file = new File(path);
        try {
            FileWriter outputfile = new FileWriter(file);
            CSVWriter writer = new CSVWriter(outputfile);

            for (RandomWalk randomWalk : randomWalks) {
                String[] data = {Integer.toString(randomWalk.getX0()), Integer.toString(randomWalk.getY0())};
                writer.writeNext(data);
            }

            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        ArrayList<RandomWalk> walks = new ArrayList<RandomWalk>();
        RandomWalk randomWalk = new RandomWalk(0, 0);
        int step = 0;
            while (Math.sqrt(Math.pow(randomWalk.getX0(), 2) + Math.pow(randomWalk.getY0(), 2)) < 100){
                randomWalk.randomWalkingPoint();
                walks.add(new RandomWalk(randomWalk.getX0(), randomWalk.getY0()));
                step++;
            }

        System.out.println("Liczba kroków to: " + step);

        exportData("C:/Users/weran/IdeaProjects/ZPO_lab_7/src/main/java/RandomWalk/randomWalkData.csv", walks);
    }

}
