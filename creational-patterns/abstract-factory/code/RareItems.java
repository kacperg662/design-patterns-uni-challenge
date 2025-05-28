public class RareItems implements Shop {
    @Override
    public Sword createSword() {
        return new RareSword();
    }

    @Override
    public Shield createShield() {
        return new RareShield();
    }
}
