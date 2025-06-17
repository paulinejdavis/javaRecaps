package filereading;

import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class ReadFromFile {
    public static void readFile(String readNow) {
        try (FileReader reader = new FileReader(readNow)) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.println((char) character);
            }

        } catch (IOException e) {
            System.out.println("Error bitches: " + e.getMessage());
        }
    }
}
