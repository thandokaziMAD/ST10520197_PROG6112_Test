/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.number1electronics;

/**
 *
 * @author Student
 */


public class Number1Electronics {

    public static void main(String[] args) {

        // These arrays store the city names and console names
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        // This 2D array stores the sales for each console in each city
        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };

        // This array will keep the total sales for each city
        int[] totalSales = new int[cities.length];

        System.out.println("------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("------------------------------------------------------");

        // Print the console headings
        System.out.printf("%-20s %-10s %-10s %-10s%n",
                "", consoles[0], consoles[1], consoles[2]);

        // Go through each city
        for (int i = 0; i < cities.length; i++) {

            System.out.printf("%-20s", cities[i]);

            // Go through the console sales for the current city
            for (int j = 0; j < sales[i].length; j++) {

                System.out.printf("%-10d", sales[i][j]);

                // Add each console sale to the city's total
                totalSales[i] = totalSales[i] + sales[i][j];
            }

            System.out.println();
        }

        System.out.println("------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("------------------------------------------------------");

        // Display the total sales for every city
        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i] + ": " + totalSales[i]);
        }

        // Start by assuming the first city has the highest sales
        int highestSales = totalSales[0];
        String topCity = cities[0];

        // Compare the other cities with the first city
        for (int i = 1; i < totalSales.length; i++) {

            if (totalSales[i] > highestSales) {
                highestSales = totalSales[i];
                topCity = cities[i];
            }
        }

        System.out.println();
        System.out.println("CITY WITH THE MOST SALES: " + topCity);
        System.out.println("------------------------------------------------------");
    }
}