package com.example.myapplication.quarter2.practicalexam;
import java.util.Scanner;

public class TamayoFastfoodMenu {
    public static void start(Scanner scanner) {
        System.out.println("===================");
        System.out.println("Start Taking Order?");
        System.out.println("Start Ordering your meal");
        System.out.println("==================");
        int picking;
        int adding;
        int choice3;
        int choice4;
        boolean MenuLoop = true;
        while (MenuLoop) {
            picking = scanner.nextInt();
            adding = scanner.nextInt();
            choice3 = scanner.nextInt();
            choice4 = scanner.nextInt();
            if (picking == 1) {
                System.out.println("Ordered Burger as Combo");
            } if (adding == 1) {
                System.out.println("Ordered Burger as Solo");
                System.out.println("===================");
            } if (choice3 == 1) {
                System.out.println("Ordered Fries");

            }  if (choice4 == 2) {
                System.out.println("===================");
                System.out.println("Succesfully ordered your food");
                System.out.println("Choose exit");
                System.out.println("===================");
                System.out.println("exiting");

                MenuLoop = false;
            }
        }
    }
}


