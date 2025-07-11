package lesson2.lecture.unidirectional.one_to_one;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    //contains a collection of items
    private List<Item> items;
    ShoppingCart() {
        items = new ArrayList<Item>();
    }
    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }
}
