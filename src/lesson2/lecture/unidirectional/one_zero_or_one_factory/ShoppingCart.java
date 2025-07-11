package lesson2.lecture.unidirectional.one_zero_or_one_factory;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;
    private ShoppingCart() {
        items = new ArrayList<>();
    }
    public static ShoppingCart createShoppingCart(Customer customer) {
        if (customer == null) {
            throw new IllegalArgumentException("Customer is null");
        }
        ShoppingCart shoppingCart = new ShoppingCart();
        //set shoppingCart in Customer class
        customer.setShoppingCart(shoppingCart);
        return shoppingCart;
    }
    
    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }
}
