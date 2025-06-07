public class Caretaker {
    private Player.Memento memento;

    public void backUp(Player player) {
        this.memento = player.createMemento(player.getMaxHp(), player.getCurrentHp());
    }

    public void restore(Player player) {
        if (this.memento != null) {
            player.restoreMemento(this.memento);
        }
    }
}
