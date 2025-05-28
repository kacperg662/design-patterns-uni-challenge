public class CommonItems implements Shop{
    @Override
    public Sword createSword() {
        return new CommonSword();
    }

    @Override
    public Shield createShield() {
        return new CommonShield();
    }
}
