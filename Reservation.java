/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servease_test;

/**
 *
 * @author hp
 */
import java.time.LocalDateTime;
import java.util.List;

public class Reservation {
    private int numberOfPeople;
    private LocalDateTime reservationTime;
    private List<Tables> availableTables;

    public Reservation(int numberOfPeople, LocalDateTime reservationTime, List<Tables> availableTables) {
        this.numberOfPeople = numberOfPeople;
        this.reservationTime = reservationTime;
        this.availableTables = availableTables;
    }

    public boolean isAvailable() {
        // Check if there are available tables
        return !availableTables.isEmpty();
    }

    public void bookTable() {
        // Code to book a table
        System.out.println("Table booked for " + numberOfPeople + " at " + reservationTime);
    }
}