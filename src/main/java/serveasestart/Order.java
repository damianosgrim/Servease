/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serveasestart;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author hp
 */
import java.util.ArrayList;
import java.util.List;

public class Order {
    private String tableNumber;
    private String roomNumber;
    private List<String> items;
    private boolean isPaid;
    private int num_people;

    public Order(String tableNumber, String roomNumber, int num_people) {
        this.tableNumber = tableNumber;
        this.roomNumber = roomNumber;
        this.items = new ArrayList<>();
        this.isPaid = false;
        this.num_people = num_people; 
    }

   
    public void placeOrder() {
        // Code to place order
        System.out.println("Order placed for table " + tableNumber + " and room " + roomNumber);
    } 
    public void addItem(String item, String note) {
        items.add(item + " - " + note);
    }

    public void viewOrder() {
        System.out.println("Order for table " + tableNumber + ":");
        for (String item : items) {
            System.out.println(item);
        }
    }

    public void sendOrder() {
        // Code to send the order
        System.out.println("Order sent for table " + tableNumber);
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void payOrder(RoomCharge roomCharge) {
        if (roomCharge.isCardProvided() && roomCharge.getCreditLimit() >= calculateTotal()) {
            this.isPaid = true;
            System.out.println("Order paid using room charge for room " + roomCharge.getRoomNumber());
        } else {
            System.out.println("Payment failed. Not enough credit or card not provided.");
        }
    }

    private double calculateTotal() {
        // Dummy implementation
        return items.size() * 10.0; // Assume each item costs 10 units
    }
    
     public int getNum_people() {
        return num_people;
        
    }
     
      public String getTableNumber() {
        return tableNumber;
    }
      
     
      public String getRoomNumber() {
        return roomNumber;
    }
}

