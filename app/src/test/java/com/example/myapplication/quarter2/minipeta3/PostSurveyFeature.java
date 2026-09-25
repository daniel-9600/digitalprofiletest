package com.example.myapplication.quarter2.minipeta3;
import org.junit.Test;
import java.util.Scanner;

public class PostSurveyFeature {
  public static void execute(Scanner scanner) {
    int Scores = scanner.nextInt();
    boolean isRunning = true;

    while (isRunning) {
      System.out.println("=============");
      System.out.println("=======");
      System.out.println("Top 3 Subjects are example, example, example");
      System.out.println("Saving Scores");
      System.out.println("Scores are = " + Scores);
      System.out.println("Displaying Possible Outcomes Careers,Pathways,Jobs");
      System.out.println("=========");
      System.out.println("==============");
      isRunning = false;
      // OPTION 1: WOULD YOU LIKE YOUR SCORES MADE IN PUBLIC?
    }
  }
}