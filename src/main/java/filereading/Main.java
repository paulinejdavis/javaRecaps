package filereading;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        String sourcePath = "source.txt";
        String destinationPath = "destination.txt";

        try {
            CopyFile.copyFile(sourcePath, destinationPath);
            System.out.println("File copy success");
        } catch (FileNotFoundException e) {
            System.out.println("Errors");
        }
    }
}
