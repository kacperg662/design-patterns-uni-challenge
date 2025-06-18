public class Rectangle extends Shape{
    private int height;
    private int width;

    public Rectangle(Renderer renderer, int height, int width) {
        super(renderer);
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw() {
        renderer.renderRectangle(height, width);
    }
}
