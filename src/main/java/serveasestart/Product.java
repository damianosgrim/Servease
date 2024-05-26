/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serveasestart;

/**
 *
 * @author hp
 */
// Κλάση Προϊόν
public class Product {
    private String name;
    private double price;
    private String description;

    // Κατασκευαστής
    public Product(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // Μέθοδος για ανάκτηση του ονόματος
    public String getName() {
        return name;
    }

    // Μέθοδος για ανάκτηση της τιμής
    public double getPrice() {
        return price;
    }

    // Μέθοδος για ανάκτηση της περιγραφής
    public String getDescription() {
        return description;
    }
}
