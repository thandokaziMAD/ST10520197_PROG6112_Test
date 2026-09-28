/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


package com.mycompany.consolesales;

// ConsoleSales gets its information from the Console class
public class ConsoleSales extends Console {

    // Constructor receives the console, store and sales information
    public ConsoleSales(String consoleType, String store, int totalSales) {
        super(consoleType, store, totalSales);
    }

    // This method prints the final console sales report
    @Override
    public void printReport() {

        System.out.println();
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("********************");
        System.out.println("CONSOLE TYPE: " + getConsoleType());
        System.out.println("STORE: " + getStore());
        System.out.println("TOTAL SALES: " + getTotalSales());
    }
}