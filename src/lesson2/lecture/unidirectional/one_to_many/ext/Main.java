package lesson2.lecture.unidirectional.one_to_many.ext;

import lesson2.lecture.unidirectional.one_to_many.Customer;
import lesson2.lecture.unidirectional.one_to_many.Item;
import lesson2.lecture.unidirectional.one_to_many.Order;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Lily");
//        Order order = new Order();
        //first order
        Order order = customer.addOrder();
        order.addItem(new Item("Note Book"));
        order.addItem(new Item("Pen"));
        //second order
        order = customer.addOrder();
        order.addItem(new Item("Apple"));
        order.addItem(new Item("Pear"));

        System.out.println(
                customer.getCustomerName() + " has " +
                        customer.getOrders().size() + " orders"
        );

    }
}
