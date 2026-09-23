package com.example.myapplication.quarter2.practicalexam;

import java.util.Scanner;
public class OcampoLibraryMenu {
    public void start(Scanner scanner) {
        System.out.println("====================");
        System.out.println("Welcome to the Library!");
        System.out.println("Would you like to borrow a book?");
        System.out.println("====================");
        int choice;
        int payment;
        boolean MenuLoop = true;
        while (MenuLoop) {
            choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Example Book Selected!");
                System.out.println("Fine is = ₱15");
                System.out.println("====================");
            } else if (choice == 2) {
                System.out.println("Paying fine...");
                System.out.println("====================");
                payment = scanner.nextInt();
                if (payment < 15) {
                    System.out.println("Insufficient Funds!");
                    System.out.println("Your payment is = " + payment);
                    System.out.println("Payment should be ₱15");
                    System.out.println("====================");
                } else if (payment >= 15) {
                    System.out.println("Payment Successful!");
                    int change = payment - 15;
                    System.out.println("Change is = " + change);
                    System.out.println("====================");
                }
            } else if (choice == 3) {
                System.out.println("Exiting.");
                System.out.println("====================");
                MenuLoop = false;
            }
        }
    }
}