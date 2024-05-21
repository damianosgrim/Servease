/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servease_test;

import java.util.HashMap;
import java.util.Map;

public class Menu {
    private Map<String, MenuItem> menuItems;

    public Menu() {
        this.menuItems = new HashMap<>();
    }

    public void displayMenu() {
        System.out.println("Menu:");
        for (MenuItem item : menuItems.values()) {
            System.out.println(item);
        }
    }

    public void addItem(String name, double price, String description) {
        if (menuItems.containsKey(name)) {
            System.out.println("Item already exists.");
        } else {
            MenuItem newItem = new MenuItem(name, price, description);
            menuItems.put(name, newItem);
            System.out.println("Item added successfully.");
        }
    }

    public void deleteItem(String name) {
        if (menuItems.containsKey(name)) {
            menuItems.remove(name);
            System.out.println("Item deleted successfully.");
        } else {
            System.out.println("Item does not exist.");
        }
    }

    public void modifyItemPrice(String name, double newPrice) {
        if (menuItems.containsKey(name)) {
            MenuItem item = menuItems.get(name);
            item.setPrice(newPrice);
            System.out.println("Item price updated successfully.");
        } else {
            System.out.println("Item does not exist.");
        }
    }
}

class MenuItem {
    private String name;
    private double price;
    private String description;

    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + ": " + price + " - " + description;
    }
}

