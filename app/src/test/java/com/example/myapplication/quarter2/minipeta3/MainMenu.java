package com.example.myapplication.quarter2.minipeta3;
import java.util.Scanner;
public class MainMenu {

    public void start(Scanner scanner) {
        System.out.println("=========================");
        System.out.println("Welcome to the Main Menu.");
        System.out.println("Leaderboard = ");
        System.out.println("Option 1 = Take the test.");
        System.out.println("Option 2 = Check Possible Courses.");
        System.out.println("Option 3 = Check Past Scores.");
        System.out.println("=========================");
        int choice = 1;
        boolean Choosing = true;
        while (Choosing) {
            if (choice == 1) {
                System.out.println("Taking the test!");
                System.out.println("=========================");
                SurveyFeature surveyFeature = new SurveyFeature();
                SurveyFeature.execute(scanner);
            } else if (choice == 2) {
                System.out.println("Checking possible courses...");
                System.out.println("=========================");
                PossibleCoursesFeature possibleCoursesFeature = new PossibleCoursesFeature();
                PossibleCoursesFeature.execute(scanner);
            } else if (choice == 3) {
                System.out.println("Checking past scores if you have any...");
                System.out.println("=========================");
            } else {
                Choosing = false;
            }
            choice++;
        }
        }

    }

