package com.example.myapplication.quarter2.minipeta3;
import org.junit.Test;

import java.util.Scanner;

public class SurveyFeature {


    public static void execute(Scanner scanner) {
        System.out.println("===WELCOME TO THE EXAMPLE SEGMENT===");
        int choice = 1;
        boolean Choosing = true;

        while (Choosing) {
            switch (choice) {
                case 1:
                    System.out.println("Answered Yes");
                    choice++;
                     break;
                case 2:
                    System.out.println("Answered No");
                    break;
            } Choosing = false;
        }
    }
}