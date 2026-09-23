package com.example.myapplication.quarter2.minipeta3;
import java.util.Scanner;
import org.junit.Test;
public class MainMenu {
    @Test

    public void start(Scanner scanner) {
        System.out.println("=========================");
        System.out.println("Welcome to the Main Menu.");
        System.out.println("Leaderboard = ");
        System.out.println("Option 1 = Take the test.");
        System.out.println("Option 2 = Check Possible Courses.");
        System.out.println("Option 3 = Post Survey Screen.");
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
                possibleCoursesFeature possibleCoursesFeature = new possibleCoursesFeature();
                possibleCoursesFeature.execute(scanner);

            } else if (choice == 3) {
                System.out.println("Opening the Post Survey screen...");
                System.out.println("=========================");
                PostSurveyFeature postSurveyFeature = new PostSurveyFeature();
                PostSurveyFeature.execute(scanner);
            } else {
                Choosing = false;
            }
            choice++;
        }
        }

    }

