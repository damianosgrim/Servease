/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servease_test;

import java.util.List;

/**
 *
 * @author hp
 */
public class Menu {
    private int id;
    private List<Product> products;

    public Menu(int id, List<Product> products) {
        this.id = id;
        this.products = products;
    }

    public void viewProducts() {
        // Προβολή προϊόντων
    }

    public void modifyPrice(Product product, double newPrice) {
        // Τροποποίηση τιμής προϊόντος
    }

    public void deleteProduct(Product product) {
        // Διαγραφή προϊόντος
    }
    
    // Μέθοδος για προσθήκη προϊόντος στον κατάλογο
    public void addProduct(Product product) {
        products.add(product);
    }
}