public class Main {
    public static void main(String[] args) {
        Player player = new Player(100);
        Caretaker caretaker = new Caretaker();

        System.out.println("Initial HP: " + player.getCurrentHp());
        caretaker.backUp(player);

        player.setCurrentHp(30);
        System.out.println("Player took damage. Current HP: " + player.getCurrentHp());

        caretaker.restore(player);
        System.out.println("Restored HP: " + player.getCurrentHp());
    }
}
