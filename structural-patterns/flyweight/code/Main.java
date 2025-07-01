public class Main {
    public static void main(String[] args) {
        Forest forest = new Forest();

        forest.plantTree(10, 20, "Oak", "Green", "Rough");
        forest.plantTree(15, 25, "Oak", "Green", "Rough");
        forest.plantTree(20, 30, "Pine", "Dark Green", "Smooth");
        forest.plantTree(25, 35, "Oak", "Green", "Rough");

        forest.draw("Canvas_1");
    }
}