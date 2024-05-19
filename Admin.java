
package servease_test;

/**
 *
 * @author hp
 */
public class Admin extends User {
    public Admin(int id, String username, String password) {
        super(id, username, password, "admin");
    }
    public void editMenu() {
        // Επεξεργασία μενού
    }

    public void manageStaff() {
        // Διαχείριση προσωπικού
    }
}