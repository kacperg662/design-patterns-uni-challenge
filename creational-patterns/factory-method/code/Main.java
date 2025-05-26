public class Main {
    public static void main(String[] args) {
        ItemShop itemShop = new ItemShop();

        CreatorSword creatorSword = new CreatorSword();
        CreatorShield creatorShield = new CreatorShield();
        CreatorCape creatorCape = new CreatorCape();

        Item item1 = itemShop.createItem(creatorSword, Rarity.Epic);
        Item item2 = itemShop.createItem(creatorShield, Rarity.Legendary);
        Item item3 = itemShop.createItem(creatorCape, Rarity.Common);

        System.out.println(item1.getRarity().toString());
        System.out.println(item2.getType().toString());
        System.out.println(item3.getType().toString());
    }
}
