/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.consolesales;

import java.util.Scanner;

public class RunApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String consoleType;

        // Show the console choices to the user
        System.out.println("Select the console type");
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("3) SWITCH");
        System.out.print("\nEnter your choice: ");

        int choice = input.nextInt();
        input.nextLine();

        // Work out which console the user selected
        switch (choice) {

            case 1:
                consoleType = "PS5";
                break;

            case 2:
                consoleType = "XBOX";
                break;

            case 3:
                consoleType = "SWITCH";
                break;

            default:
                System.out.println("Invalid console selection.");
                input.close();
                return;
        }

        // Ask the user for the store name
        System.out.print("Enter the store: ");
        String store = input.nextLine();

        // Ask for the total number of sales
        System.out.print("Enter the total sales of "
                + consoleType + " consoles for "
                + store + ": ");

        int totalSales = input.nextInt();

        // Create the ConsoleSales object
        ConsoleSales sales = new ConsoleSales(
                consoleType,
                store,
                totalSales
        );

        // Print the report
        sales.printReport();

        input.close();
    }
}