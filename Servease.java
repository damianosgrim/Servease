/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package servease_test;

import java.time.LocalDateTime;
import java.util.Arrays;

/**
 *
 * @author hp
 */
public class Servease{

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // Create some example data
        Customer customer = new Customer("c201", "dgrimanis", "Damianos", "Grimanis", "grimanis101",  101);
        Reservation reservation = new Reservation(4, LocalDateTime.now(), Arrays.asList(new Tables(1), new Tables(2)));
        Waiter waiter = new Waiter("w101", "mgianeiou", "Melina", "Gianeiou","password");
         Menu menu = new Menu();
        Admin admin = new Admin("a001", "admin", "Eri", "Ntoulai", "adminpass", menu);
        

        // Example Use Case 1: Table Reservation
        if (customer.authenticate()) {
            customer.makeReservation(reservation);
        }

        // Example Use Case 2: View Menu
        if (customer.authenticate()) {
            customer.viewMenu(menu);
        }

   
  
    
 
} }
    

    