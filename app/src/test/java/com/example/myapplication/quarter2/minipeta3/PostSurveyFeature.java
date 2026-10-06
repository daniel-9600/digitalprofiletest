package com.example.myapplication.quarter2.minipeta3;

import java.util.Scanner;
public class PostSurveyFeature {

    public static void execute(Scanner scanner) {
        int choice = 0;
        boolean choosing = true;
        System.out.println("===============================");
        System.out.println("Count the most scored subjects");
        System.out.println("Save the Counted scores for this account");
        System.out.println("display the possible jobs,path,careers")'
        System.out.println("Would you like your scores be made in public?");
        System.out.println("add to leaderboard");
        System.out.println("===============================");

        // STEP 2:
        while (choosing) {
            switch (choice) {



                case 1:
                    System.out.println("insert the most scored subjects");
                    choice++;
                    break;
                case 2:
                    System.out.println("saving the most scored subjects");
                    choice++;
                    break;
                case 3:
                    System.out.println("insert the possible career,path,jobs");
                    choice++;
                    break;
                case 4:
                    System.out.println("insert the scores if YES");
                    choice++;
                    break;
                case 5:
                    System.out.println("insert add the scores to leaderboard");
                    choice++;
                    break;

            }
        }
    }
