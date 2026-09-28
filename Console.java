/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.consolesales;

// Abstract class that stores the main console sales information
public abstract class Console implements IConsoles {

    private String consoleType;
    private String store;
    private int totalSales;

    // Constructor used to give values to the console information
    public Console(String consoleType, String store, int totalSales) {
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
    }

    // Returns the selected console type
    public String getConsoleType() {
        return consoleType;
    }

    // Returns the store name
    public String getStore() {
        return store;
    }

    // Returns the total console sales
    public int getTotalSales() {
        return totalSales;
    }

    // The subclass will provide the code for this method
    public abstract void printReport();
}