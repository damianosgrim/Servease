/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serveasestart;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Customer extends User {

    static ArrayList<Customer> customers;

    private int roomNumber;
    private String lastName;
    private String firstName;
    private String checkInDate;
    private String checkOutDate;

    public Customer(String id, String username, String firstName, String lastName , String password, String checkInDate, String checkOutDate, int roomNumber) {
        super(id, username, firstName, lastName, password,"customer");
        this.roomNumber = roomNumber;
        this.lastName = lastName;
        this.firstName = firstName;
         this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
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
}

