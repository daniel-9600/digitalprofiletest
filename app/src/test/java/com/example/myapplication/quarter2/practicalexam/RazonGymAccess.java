package com.example.myapplication.quarter2.practicalexam;
import java.util.Scanner;

public class RazonGymAccess {
    public void start(Scanner gyminput) {
        System.out.println("===================================================");
        System.out.println("RAZON'S GYM, DO YOU HAVE WHAT IT TAKES?");
        System.out.println("WOULD YOU LIKE TO PURCHASE THE GYM MEMBERSHIP?");
        System.out.println("===================================================");
        boolean TheMenu = true;
        int yourchoice;

        int funds;
        while (TheMenu) {
            yourchoice = gyminput.nextInt();
            funds = gyminput.nextInt();
            if (yourchoice == 1) {
                System.out.println("YES.");
                System.out.println("===================================================");
                System.out.println("SEEMS LIKE YOU'RE NOT A WUSS!");
                System.out.println("THE MEMBERSHIP IS $10 PER MONTH");
                System.out.println("ARE YOU ABLE TO PAY FOR THIS?");
                System.out.println("===================================================");
                    if (funds <= 9) {
                        System.out.println("WELL, YOU'VE GOT THE GUTS.. JUST NOT THE MONEY!");
                        System.out.println("COME BACK WHENEVER YOU HAVE THE MONEY.");
                        System.out.println("(Left with " + funds + "$.)");
                        System.out.println("===================================================");
                    } else if (funds >= 10) {
                        System.out.println("GUTS, AND THE MONEY? YOU ARE A REAL TOUGH ONE!");
                        System.out.println("(Paid with " + funds + "$.)");
                        System.out.println("===================================================");
                    }
            } else if (yourchoice == 2) {
                System.out.println("NO.");
                System.out.println("===================================================");
                System.out.println("SEEMS LIKE YOU ARE A WUSS, COME BACK WHENEVER YOU HAVE THE GUTS!");
                System.out.println("===================================================");
                    System.out.println("UHH..");
                    System.out.println("(YOU GOT SCARED AND RAN AWAY.)");
                    System.out.println("===================================================");
                    TheMenu = false;

            }
        }
    }
}
//Commit #2. Commit #3.