public interface Observer {
    void update(Entity entity, Room oldRoom, Room newRoom);
}
