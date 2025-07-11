package lesson2.lecture.unidirectional.one_zero_or_one_factory;

public class Customer {
    private String customerName;
    private ShoppingCart shoppingCart;

    public Customer(String customerName) {
        this.customerName = customerName;
    }
    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        if (shoppingCart != null) {
            this.shoppingCart = shoppingCart;
        }
    }

}
