public class VectorRenderer implements Renderer{
    public void renderCircle(float radius) {
        System.out.println("Drawing lines for a circle of radius " + radius);
    }
    public void renderRectangle(int height, int width) {
        System.out.println("Drawing lines for a rectangle of size " + height + ", " + width);
    }
}
