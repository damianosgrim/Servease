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
    public String tableNumber;
    private String roomNumber;
    private List<String> items;
    private boolean isPaid;
    private int num_people;
    private List<Double> prices;
    

    public Order(String tableNumber, String roomNumber, int num_people) {
        this.tableNumber = tableNumber;
        this.roomNumber = roomNumber;
        this.items = new ArrayList<>();
        this.isPaid = false;
        this.num_people = num_people; 
        this.prices = new ArrayList<>();
    }

   
    public void placeOrder() {
        // Code to place order
        System.out.println("Order placed for table " + tableNumber + " and room " + roomNumber);
    } 
 /*public void addItem(String item, String note) {
        items.add(item + " - " + note);
    }*/
    
   public void addItem(String item, double price) {
    items.add(item);
    prices.add(price);
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

    public double calculateTotal() {
        double total = 0;
        for (double price : prices) {
            total += price;
        }
        return total;
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
      
        public List<String> getItems() {
        return items;
    }
        
     public List<Double> getPrices() {
    return prices;
}
     public void setPaid(boolean isPaid) {
    this.isPaid = isPaid;
}
}

