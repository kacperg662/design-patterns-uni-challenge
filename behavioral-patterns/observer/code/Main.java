public class  Main {
    public static void main(String[] args) {
        Room room1 = new Room("Kitchen");
        Room room2 = new Room("Library");

        Player player = new Player();
        player.addObserver(room1);
        player.addObserver(room2);

        player.moveTo(room1);
        player.moveTo(room2);

        System.out.println("Entities in Kitchen: " + room1.getEntitiesInRoom());
        System.out.println("Entities in Library: " + room2.getEntitiesInRoom());
    }
}
