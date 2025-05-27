public class Main {
    public static void main(String[] args) {
        Sword basicSword = new BasicSword();
        System.out.println("Basic sword: " + basicSword.getRarity() + ", damage: " + basicSword.getDamage());

        Sword epicSword = new EpicSwordDecorator(basicSword);
        System.out.println("Epic sword: " + epicSword.getRarity() + ", damage: " + epicSword.getDamage());

        Sword legendarySword = new LegendarySwordDecorator(epicSword);
        System.out.println("Legendary sword: " + legendarySword.getRarity() + ", damage: " + legendarySword.getDamage());
    }
}
