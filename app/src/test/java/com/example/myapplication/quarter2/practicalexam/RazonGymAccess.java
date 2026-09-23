package com.example.myapplication.quarter2.practicalexam;
import java.util.Scanner;
import org.junit.Test;

public class RazonGymAccess {
    @Test
    public void AtGym(Scanner scanner) {
        StringBuilder automatedInput = new StringBuilder();
        System.out.println("===================================================");
        System.out.println("RAZON'S GYM, DO YOU HAVE WHAT IT TAKES?");
        System.out.println("WOULD YOU LIKE TO PURCHASE THE GYM MEMBERSHIP?");
        System.out.println("===================================================");
        boolean TheMenu = true;
        int paymentchoice;
        int funds;
        while (TheMenu) {
            paymentchoice = scanner.nextInt();
            funds = scanner.nextInt();
            if (paymentchoice == 1) {
                automatedInput.append("1\n");
                System.out.println("YES.");
                System.out.println("===================================================");
                System.out.println("SEEMS LIKE YOU'RE NOT A WUSS!");
                System.out.println("THE MEMBERSHIP IS $15 PER MONTH");
                System.out.println("ARE YOU ABLE TO PAY FOR THIS?");
                System.out.println("==================================================="); {
                    if (funds <=14) {
                        System.out.println("WELL, YOU'VE GOT THE GUTS.. JUST NOT THE MONEY!");
                        System.out.println("COME BACK WHENEVER YOU HAVE THE MONEY.");
                        System.out.println("(Left with " + funds + "$.");
                        System.out.println("===================================================");
                    } else if (funds >= 15)  {
                        System.out.println("GUTS, AND THE MONEY? YOU ARE A REAL TOUGH ONE!");
                        System.out.println("(Paid with " + funds + "$.");
                        System.out.println("===================================================");
                    }
                }
            } else if (paymentchoice == 2) {
                automatedInput.append("2\n");
                System.out.println("NO.");
                System.out.println("===================================================");
                System.out.println("SEEMS LIKE YOU ARE A WUSS, COME BACK WHENEVER YOU HAVE THE GUTS!");
                System.out.println("===================================================");
            }

        }
    }
}
