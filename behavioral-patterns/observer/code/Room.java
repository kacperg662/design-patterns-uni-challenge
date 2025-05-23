public class Room implements Observer, Location {
    private int entitiesInRoom;
    private final String name;

    public Room(String name) {
        this.name = name;
        this.entitiesInRoom = 0;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(Entity entity, Room oldRoom, Room newRoom) {
        if (this.equals(oldRoom)) {
            entitiesInRoom--;
        } else if (this.equals(newRoom)) {
            entitiesInRoom++;
        }
    }

    public int getEntitiesInRoom() {
        return entitiesInRoom;
    }
}
