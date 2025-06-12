package rumination;

public class GameStatusExample {
    public static void main(String[] args) {
        for (GameStatus status: GameStatus.values()) {
            System.out.println(status);
        }
        GameStatus gameStatus = GameStatus.PAUSED;
    }
}
