public class Player {
    private int maxHp;
    private int currentHp;

    public Player(int maxHp) {
        this.maxHp = maxHp;
        this.currentHp = maxHp;
    }

    public Memento createMemento(int maxHp, int currentHp) {
        return new Memento(maxHp, currentHp);
    }

    public void restoreMemento(Memento memento) {
        this.maxHp = memento.getMaxHp();
        this.currentHp = memento.getCurrentHp();
    }

    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getCurrentHp() {
        return this.currentHp;
    }

    public int getMaxHp() {
        return this.maxHp;
    }

    public static class Memento {
        private final int maxHp;
        private final int currentHp;

        private Memento(int maxHp, int currentHp) {
            this.maxHp = maxHp;
            this.currentHp = currentHp;
        }

        private int getMaxHp() {
            return this.maxHp;
        }

        private int getCurrentHp() {
            return this.currentHp;
        }
    }
}
