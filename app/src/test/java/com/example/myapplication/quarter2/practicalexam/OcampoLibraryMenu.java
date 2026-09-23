package com.example.myapplication.quarter2.practicalexam;
import java.util.Scanner;
public class OcampoLibraryMenu {
    public void start (Scanner scanner) {
        System.out.println("====================");
        System.out.println("Welcome to the Library!");
        System.out.println("Would you like to borrow a book?");
        int choice = scanner.nextInt();
        int payment = scanner.nextInt();
        boolean MenuLoop = true;
        while (MenuLoop) {
            if (choice == 1) {
                System.out.println("Example Book Selected!");
                System.out.println("Fine is = ₱50");
            }
        }
    }

}
