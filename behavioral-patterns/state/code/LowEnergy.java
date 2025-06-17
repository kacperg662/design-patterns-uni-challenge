public class LowEnergy extends State{
    public LowEnergy(Player player) {
        super(player);
    }

    @Override
    public void rest() {
        System.out.println("Player rests and recovers to Good energy.");
        player.changeState(new GoodEnergy(player));
    }

    @Override
    public void work() {
        System.out.println("Player is too tired to work.");
    }
}
