/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servease_test;

public class Customer extends User {
    private int roomNumber;

    public Customer(int id, String username, String password, Profile profile, int roomNumber) {
        super(id, username, password, "customer");
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void viewOrderHistory() {
        // Προβολή ιστορικού παραγγελιών
    }
}
