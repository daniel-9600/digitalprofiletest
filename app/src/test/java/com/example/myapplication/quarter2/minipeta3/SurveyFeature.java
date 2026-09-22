package com.example.myapplication.quarter2.minipeta3;
import org.junit.Test;

import java.util.Scanner;

public class SurveyFeature {


    public static void execute(Scanner scanner) {
        System.out.println("===WELCOME TO THE EXAMPLE SEGMENT===");
        System.out.println("Do you (example question)?");
        int choice = scanner.nextInt();
        boolean Choosing = true;
        do {
            switch (choice) {
                case 1:
                    System.out.println("Answered Yes");
                    System.out.println("==============");
                    choice++;
                    break;
                case 2:
                    System.out.println("Answered No");
                    System.out.println("==============");
                    break;
            }
        }
        while (choice == 3); {
            Choosing = false;
        }
    }
}