public class Main {
    public static void main(String[] args) {
        String name = "Geralt";
        GameManager gameManager = GameManager.getInstance();

        gameManager.startMenu();
        Player player = new Player(name);
        gameManager.startGame(player);

    }
}
