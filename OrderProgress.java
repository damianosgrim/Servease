package servease_test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class OrderProgress {
    private String orderId;
    private String destination;
    private String status;

    // Κατασκευαστής
    public OrderProgress(String orderId, String destination) {
        this.orderId = orderId;
        this.destination = destination;
        this.status = "In progress";
    }
}