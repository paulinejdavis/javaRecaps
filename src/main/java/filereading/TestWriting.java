package filereading;

public class TestWriting {
    public static void main(String[] args) {
        String file = "src/main/resources/writetoafile";
        String[] names = {"Matthew", "Mark", "Luke", "John"};
       // ReadFromFile.readFile(file);
        WriteToFile.writeNames(file, names);;
    }
}
