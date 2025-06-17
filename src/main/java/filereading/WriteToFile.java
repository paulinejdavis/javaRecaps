package filereading;

import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class WriteToFile {

    public static void writeNames(String filePath, String[] names) {
        try (FileWriter writer = new FileWriter(filePath)) {
            for (String name : names) {
                writer.write(name + "\n");
            }
        } catch (IOException e){
            System.out.println("Get it asap! " + e.getMessage());

        }
    }
}
