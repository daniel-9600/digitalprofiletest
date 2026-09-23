package com.example.myapplication.quarter2.practicalexam;

import java.util.Scanner;
public class OcampoLibraryMenu {
    public void start (Scanner scanner) {
        System.out.println("====================");
        System.out.println("Welcome to the Library!");
        System.out.println("Would you like to borrow a book?");
        int choice;
        int paying;
        int payment;
        boolean MenuLoop = true;
        while (MenuLoop) {
             choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Example Book Selected!");
                System.out.println("Fine is = ₱50");
                choice = scanner.nextInt();
            } else if (choice == 2) {
                System.out.println("Paying fine...");
                payment = scanner.nextInt();
                System.out.println(payment);
            } else if (choice == 3){
                MenuLoop = false;
            }
            }
        }
    }


