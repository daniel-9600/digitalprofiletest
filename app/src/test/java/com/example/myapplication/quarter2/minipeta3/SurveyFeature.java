package com.example.myapplication.quarter2.minipeta3; // TODO: Change this to your actual package name

import java.util.Scanner;

public class SurveyFeature {


    public void start(Scanner scanner, boolean Survey) {
        System.out.println("===WELCOME TO THE EXAMPLE SEGMENT===");
        System.out.println("==Sample3==");

        int choice = 1;
        boolean Choosing = true;
        while (Choosing) {
            if (choice % 2 == 0) {
                System.out.println("Answered Yes");
            } else {
                System.out.println("Answered No");
            }
        }
    }
}