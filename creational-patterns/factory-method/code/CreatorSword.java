public class CreatorSword implements Creator{
    @Override
    public Item create(Rarity rarity) {
        return new Sword(rarity);
    }
}
