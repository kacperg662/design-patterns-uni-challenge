public class FullEnergy extends State{
    public FullEnergy(Player player) {
        super(player);
    }

    @Override
    public void rest() {
        System.out.println("Player is already fully energized.");
    }

    @Override
    public void work() {
        System.out.println("Player works hard, energy drops to Good.");
        player.changeState(new GoodEnergy(player));
    }
}
