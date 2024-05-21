/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servease_test;

/**
 *
 * @author hp
 */
public class RoomCharge {
    private boolean cardProvided;
    private double creditLimit;
    private String roomNumber;

    public RoomCharge(boolean cardProvided, double creditLimit, String roomNumber) {
        this.cardProvided = cardProvided;
        this.creditLimit = creditLimit;
        this.roomNumber = roomNumber;
    }

    public boolean isCardProvided() {
        return cardProvided;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void activate() {
        if (cardProvided) {
            System.out.println("Room charge activated with a credit limit of " + creditLimit);
        } else {
            System.out.println("No credit card provided at the reception.");
        }
    }
}