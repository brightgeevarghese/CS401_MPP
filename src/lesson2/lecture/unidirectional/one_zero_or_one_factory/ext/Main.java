package lesson2.lecture.unidirectional.one_zero_or_one_factory.ext;

import lesson2.lecture.unidirectional.one_zero_or_one_factory.Customer;
import lesson2.lecture.unidirectional.one_zero_or_one_factory.Item;
import lesson2.lecture.unidirectional.one_zero_or_one_factory.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Tom");//no associated SC
        ShoppingCart shoppingCart = ShoppingCart.createShoppingCart(customer);
        shoppingCart.addItem(new Item("Apple"));
        shoppingCart.addItem(new Item("Pear"));
        shoppingCart.addItem(new Item("Orange"));
        System.out.println(shoppingCart.getItems());
    }
}
