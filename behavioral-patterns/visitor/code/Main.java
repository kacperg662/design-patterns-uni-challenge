public class Main {
    public static void main(String[] args) {
        Shape shape = new CompoundShape();
        Visitor xmlVisitor = new XMLExportVisitor();

        shape.move(10, 20);
        shape.draw();
        shape.accept(xmlVisitor);
    }
}