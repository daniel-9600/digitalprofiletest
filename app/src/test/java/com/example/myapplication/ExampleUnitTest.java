package com.example.myapplication;

import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void printMyProfile() {
        // INPUT, for storing the personal details
        String Myname = "Daniel";
        String Nickname = "Denial";
        String favGame = "Expedition33";
        int Myage = 16;

        // OUTPUT, printing the variables to the console
        System.out.println("---MY DIGITAL PROFILE---");
        System.out.println("Hi, I am " + Myname + "and I'm soon to be " + Myage);
        System.out.println("On the internet, I usually go by" + Nickname);
        System.out.println("I love video games and coding, and my personal favorite game is " + favGame);
    }
}