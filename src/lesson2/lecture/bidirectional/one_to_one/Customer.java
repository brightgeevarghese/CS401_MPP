package lesson2.lecture.bidirectional.one_to_one;

public class Customer {
    private String customerName;
    private ShoppingCart shoppingCart;

    public Customer(String customerName) {
        this.customerName = customerName;
        shoppingCart = new ShoppingCart(this);//pass current Customer object
    }

    public String getCustomerName() {
        return customerName;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }
}
