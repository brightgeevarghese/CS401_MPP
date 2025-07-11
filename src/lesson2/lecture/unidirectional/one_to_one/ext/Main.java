package lesson2.lecture.unidirectional.one_to_one.ext;

import lesson2.lecture.unidirectional.one_to_one.Customer;
import lesson2.lecture.unidirectional.one_to_one.Item;
import lesson2.lecture.unidirectional.one_to_one.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        //create customer
        Customer customer = new Customer("Luke");//creates an associated SC object
//        ShoppingCart shoppingCart = new ShoppingCart();
        ShoppingCart shoppingCart = customer.getShoppingCart();
        shoppingCart.addItem(new Item("Apple"));
        shoppingCart.addItem(new Item("Pear"));
        shoppingCart.addItem(new Item("Orange"));
        shoppingCart.addItem(new Item("Water"));
        System.out.println(shoppingCart.getItems() + " added by " + customer.getCustomerName());
    }
}
