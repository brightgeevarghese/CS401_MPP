package lesson2.lecture.unidirectional.one_to_one;

public class Customer {
    private String customerName;
    private ShoppingCart shoppingCart;

    public Customer(String customerName) {
        this.customerName = customerName;
        this.shoppingCart = new ShoppingCart();
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public String getCustomerName() {
        return customerName;
    }
}
