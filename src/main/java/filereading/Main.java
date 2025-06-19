package filereading;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        String sourcePath = "src/main/resources/source.txt";
        String destinationPath = "src/main/resources/destination.txt";

        try {
            CopyFile.copyFile(sourcePath, destinationPath);
            System.out.println("File copy success");
        } catch (FileNotFoundException e) {
            System.out.println("Errors");
        }
    }
}
