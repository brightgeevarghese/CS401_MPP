package lesson2.lecture.unidirectional.one_to_one_factory;

public class Customer {
    private String customerName;
    private ShoppingCart shoppingCart;

    public Customer(String customerName) {
        this.customerName = customerName;
//        this.shoppingCart = new ShoppingCart();
        ShoppingCart.createShoppingCart(this);
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        if (shoppingCart != null) {
            this.shoppingCart = shoppingCart;
        }
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public String getCustomerName() {
        return customerName;
    }
}
