public class Player {
    private State state;

    public Player() {
        this.state = new FullEnergy(this);
    }

    public void changeState(State state) {
        this.state = state;
    }

    public void rest() {
        state.rest();
    }

    public void work() {
        state.work();
    }
}
