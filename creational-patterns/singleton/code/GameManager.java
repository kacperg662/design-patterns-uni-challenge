public class GameManager {
    private static GameManager instance;

    private GameManager() {}

    public static GameManager getInstance() {
        if (instance == null) {
            instance = new GameManager();
        }
        return instance;
    }

    public void startMenu() {
        System.out.println("Menu\n");
    }

    public void startGame(Player player) {
        System.out.println("Very epic game.");
        System.out.println("Welcome " + player.getName());
    }
}
