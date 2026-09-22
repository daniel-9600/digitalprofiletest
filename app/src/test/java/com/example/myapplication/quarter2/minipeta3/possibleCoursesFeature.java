package com.example.myapplication.quarter2.minipeta3;
import org.junit.Test;
import java.util.Scanner;
public class possibleCoursesFeature {

    public static void execute(Scanner scanner) {
        int choice = 0;
        boolean choosing = true;
        System.out.println("===============================");
        System.out.println("1.view related courses to tle");
        System.out.println("2.view related courses to mapeh");
        System.out.println("3.viewlated courses to ict");
        System.out.println("4.view related courses to math");
        System.out.println("5.view related courses to linguistics");
        System.out.println("6.view related courses to science");
        System.out.println("8.exit");
        System.out.println("===============================");

        // STEP 2: DISPLAYING THE COURSES RE4LATED TO EACH SUBJECT//
        while (choosing) {
            switch (choice) {



                case 1:
                    System.out.println("insert courses related to tle here");
                    choice++;
                    break;
                case 2:
                    System.out.println("insert courses related to mapeh here");
                    choice++;
                    break;
                case 3:
                    System.out.println("insert courses related to ict here");
                    choice++;
                    break;
                case 4:
                    System.out.println("insert courses related to math here");
                    choice++;
                    break;
                case 5:
                    System.out.println("insert courses related to linguistics here");
                    choice++;
                    break;
                case 6:
                    System.out.println("insert courses related to science here");
                    choice++;
                    break;
                case 7:
                    System.out.println("hmmm, you havent chosen a course yet!");
                    choice++;
                    break;
                case 8:
                    System.out.println("exit? Y/N");
                    choice++;
                    break;

            } choosing = false;
        }
    }
}