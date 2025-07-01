class TreeType {
    private String name;
    private String color;
    private String texture;

    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void draw(String canvas, int x, int y) {
        System.out.println("Rysuję drzewo typu: " + name + " o kolorze: " + color + " i teksturze: " + texture + " na " + canvas + " w pozycji (" + x + ", " + y + ")");
    }
}
