package code;

public class Main {
    public static void main(String[] args) {
        Item sword = new Sword(100);
        Item shield = new Shield(80);

        Composite items = new Composite();
        items.add(sword);
        items.add(shield);

        items.sell();
    }
}