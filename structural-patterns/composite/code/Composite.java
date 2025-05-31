package code;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Item {
    private List<Item> items;

    public Composite() {
        this.items = new ArrayList<>();
    }

    public void add(Item item) {
        items.add(item);
    }

    @Override
    public void sell() {
        for (Item item : items) {
            item.sell();
        }
    }
}