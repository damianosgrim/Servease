package servease_test;

public class Waiter extends User {
    public Waiter(String id, String username, String firstName, String lastName, String password) {
        super(id, username, firstName, lastName, password, "waiter");
    }
 
 public boolean authenticate() {
        // Code to authenticate waiter
        // For simplicity, assume always returns true
        return true;
    }

    public void takeOrder(Order order) {
        order.placeOrder();
    }
}
