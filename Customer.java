/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serveasestart;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import serveasestart.User;

public class Customer extends User {

    static ArrayList<Customer> customers;

    private int roomNumber;
    private String lastName;
    private String firstName;
    private String checkInDate;
    private String checkOutDate;
    private RoomCharge roomCharge;

    public Customer(String id, String username, String firstName, String lastName , String password, String checkInDate, String checkOutDate, int roomNumber) {
        super(id, username, firstName, lastName, password,"customer");
        this.roomNumber = roomNumber;
        this.lastName = lastName;
        this.firstName = firstName;
         this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    
 
public RoomCharge getRoomCharge() {
        return roomCharge;
    }

    public void setRoomCharge(RoomCharge roomCharge) {
        this.roomCharge = roomCharge;
    }

   
    public String getFirstName() {
        return firstName;
    }
    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getLastName() {
        return lastName;
    }
public String getCheckInDate() {
        return checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }
    public static void setCustomers(ArrayList<Customer> customers) {
        Customer.customers = customers;
    }

    
    public void viewOrderHistory() {
        // Προβολή ιστορικού παραγγελιών
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
            this.setRoomCharge(roomCharge);
        } else {
            System.out.println("No credit card provided at the reception.");
        }
    }
}

