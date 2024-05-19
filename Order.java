/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servease_test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author hp
 */
public class Order {
    private Customer customer;
    private List<Product> products;
    private double totalAmount;
    private boolean isPaid;

    // Κατασκευαστής
    public Order(Customer customer) {
        this.customer = customer;
        this.products = new ArrayList<>();
        this.totalAmount = 0.0;
        this.isPaid = false;
    }

    // Μέθοδος για προσθήκη προϊόντος
    public void addProduct(Product product) {
        products.add(product);
        totalAmount += product.getPrice();
    }

    // Μέθοδος για πληρωμή
    public void makePayment() {
        isPaid = true;
    }
}
