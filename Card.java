/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serveasestart;

/**
 *
 * @author hp
 */
public class Card {
    private String cardNumber;
    private String expirationDate;
    private int securityCode;
    private String cardHolderName;

    // Κατασκευαστής
    public Card(String cardNumber, String expirationDate, int securityCode, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.securityCode = securityCode;
        this.cardHolderName = cardHolderName;
    }
}