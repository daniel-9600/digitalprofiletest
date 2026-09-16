package com.example.myapplication.quarter2.minipeta3; // TODO: Change this to your actual package name

import java.util.Scanner;

public class SurveyFeature {


    public static void execute(Scanner scanner) {
        System.out.println("===WELCOME TO THE EXAMPLE SEGMENT===");
        int choice = 2;
        boolean Choosing = true;

        while (Choosing) {
            if (choice % 2 == 0) {
                System.out.println("Answered Yes");
                System.out.println("===============");
                choice--;
            } else {
                System.out.println("Answered No");
                System.out.println("===============");
            } Choosing = false;

        }

    }
}