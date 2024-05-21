
package servease_test;

import servease_test.User;

/**
 *
 * @author hp
 */
import java.util.HashMap;
import java.util.Map;

public class Admin extends User {

    private Map<String, Waiter> staff;
    private Menu menu;

    public Admin(String id, String username, String firstName, String lastName, String password, Menu menu) {
       
        super(id, username, firstName, lastName, password, "admin");
    
        this.staff = new HashMap<>();
        this.menu = menu;
    }

    public boolean authenticate() {
        // Code to authenticate admin
        // For simplicity, assume always returns true
        return true;
    }

    public void addWaiter(String id, String username, String firstName, String lastName, String password) {
        if (staff.containsKey(id)) {
            System.out.println("Waiter with this ID already exists.");
        } else {
            Waiter newWaiter = new Waiter(id, username, firstName,  lastName,  password );
            staff.put(id, newWaiter);
            System.out.println("Waiter added successfully.");
        }
    }

    public void modifyMenu(String itemName, double newPrice) {
        menu.modifyItemPrice(itemName, newPrice);
    }

    public void addMenuItem(String itemName, double price, String description) {
        menu.addItem(itemName, price, description);
    }

    public void deleteMenuItem(String itemName) {
        menu.deleteItem(itemName);
    }
}