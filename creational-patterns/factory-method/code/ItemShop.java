public class ItemShop {
    public Item createItem(Creator creator, Rarity rarity) {
        return creator.create(rarity);
    }
}
