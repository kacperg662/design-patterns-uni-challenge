import java.util.ArrayList;
import java.util.List;

public class Player implements Entity, Subject {
    private final List<Observer> observers = new ArrayList<>();
    private Room currentRoom;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Room oldRoom, Room newRoom) {
        for (Observer observer : observers) {
            observer.update(this, oldRoom, newRoom);
        }
    }

    @Override
    public void moveTo(Room newRoom) {
        Room oldRoom = this.currentRoom;
        this.currentRoom = newRoom;
        notifyObservers(oldRoom, newRoom);
    }

    @Override
    public Room getCurrentRoom() {
        return currentRoom;
    }
}
