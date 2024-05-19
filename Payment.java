/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servease_test;

/**
 *
 * @author hp
 */
public class Payment {
    private double amount;
    private Card card;

    // Κατασκευαστής
    public Payment(double amount, Card card) {
        this.amount = amount;
        this.card = card;
    }

    // Μέθοδος για εκτέλεση της πληρωμής
    public void processPayment() {
        // Εδώ θα μπορούσαμε να προσθέσουμε τη λογική για την πραγματοποίηση της πληρωμής
    }
}
