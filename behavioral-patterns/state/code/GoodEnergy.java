public class GoodEnergy extends State{
    public GoodEnergy(Player player) {
        super(player);
    }

    @Override
    public void rest() {
        System.out.println("Player rests and regains full energy.");
        player.changeState(new FullEnergy(player));
    }

    @Override
    public void work() {
        System.out.println("Player works moderately, energy drops to Low.");
        player.changeState(new LowEnergy(player));
    }
}
