package lesson2.lecture.bidirectional.one_to_one_factory.ext;

import lesson2.lecture.bidirectional.one_to_one_factory.Customer;
import lesson2.lecture.bidirectional.one_to_one_factory.CustomerSC;
import lesson2.lecture.bidirectional.one_to_one_factory.Item;
import lesson2.lecture.bidirectional.one_to_one_factory.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Customer customer = CustomerSC.createCustomer("Lily");
//        ShoppingCart shoppingCart = new ShoppingCart();
//        Customer c2 = new Customer();
        ShoppingCart shoppingCart = customer.getShoppingCart();
        shoppingCart.addItem(new Item("Pen"));
        shoppingCart.addItem(new Item("Pencil"));
        System.out.println(
                customer.getCustomerName() + ""
        );
    }
}
