package lesson2.lecture.bidirectional.one_to_one;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;
    private Customer customer;
    ShoppingCart(Customer customer) {
        items = new ArrayList<>();
        this.customer = customer;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }
}
