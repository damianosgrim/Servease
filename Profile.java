/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servease_test;

/**
 *
 * @author hp
 */
public class Profile {
    private int id;
    private String name;
    private String location;
    private int prev_order;
    private int amount;

    public Profile(int id, String name, String location, int prev_order, int amount) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.prev_order = prev_order;
        this.amount = amount;
    }


    public String getLocation() {
        return location;
    }
}



