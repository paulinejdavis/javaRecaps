package projects;

public class WordleGame {
    public static void main(String[] args) {
        Wordle wordle = new Wordle("giraffe", 4);
        wordle.play();
    }
}
