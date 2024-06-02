/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serveasestart;



public class Customer extends User {
    private int roomNumber;

    public Customer(String id, String username, String firstName, String lastName, String password, int roomNumber) {
        super(id, username, firstName, lastName, password, "customer");
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
    
     public boolean authenticate() {
        // Code to authenticate customer
        // For simplicity, assume always returns true
        return true;
    }

    public void viewMenu(Menu menu) {
        menu.displayMenu();
    }

    public void makeReservation(Reservation reservation) {
        if (reservation.isAvailable()) {
            reservation.bookTable();
        } else {
            System.out.println("No tables available at this time.");
        }
    }

    public void activateRoomCharge(RoomCharge roomCharge) {
        if (roomCharge.isCardProvided()) {
            roomCharge.activate();
        } else {
            System.out.println("No credit card provided at the reception.");
        }
    }
}
