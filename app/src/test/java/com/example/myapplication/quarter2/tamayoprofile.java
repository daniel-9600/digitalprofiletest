package com.example.myapplication.quarter2;

import org.junit.Test;
public class tamayoprofile {
    @Test
    public void printMyprofile(){
        // --- 1. THE INPUT (Storing your personal details in variables) ---
        String myName = "Paul";
        String petName = "Jaja";
        String favFood = "Adobo";
        int myAge = 16;

        // --- 2. THE OUTPUT (Printing to the console) ---
        System.out.println("--- MY DIGITAL PROFILE ---");
        System.out.println("Hello, my name is " + myName + " and i am " + myAge + " years old." );
        System.out.println("I have a cute pet named " + petName + ".");
        System.out.println("My favorite food is " + favFood + " every single day!");
    }
}
