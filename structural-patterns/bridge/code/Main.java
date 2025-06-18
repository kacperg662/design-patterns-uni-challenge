public class Main {
    public static void main(String[] args) {
        Renderer raster = new RasterRenderer();
        Renderer vector = new VectorRenderer();

        Shape circle = new Circle(raster, 5);
        Shape rectangle = new Rectangle(vector, 10, 5);

        circle.draw();
        rectangle.draw();
    }
}
