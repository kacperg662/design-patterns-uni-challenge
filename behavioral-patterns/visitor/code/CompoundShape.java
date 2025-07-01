public class CompoundShape implements Shape {
    @Override
    public void move(int x, int y) {
        System.out.println("Przemieszczono kształt o (" + x + ", " + y + ").");
    }

    @Override
    public void draw() {
        System.out.println("Rysowanie kształtu...\nNarysowano.");
    }

    @Override
    public void accept(Visitor v) {
        v.visitCompoundShape(this);
    }
}