package com.example.myapplication.quarter2;
import org.junit.Test;
public class robionprofile {
    @Test
    public void robionProfile() {

        // --1. THE INPUT (my personal data) --

        String name = "jethro";
        String whatiwant = "pc";
        String whatiwant2 = "minecraft";
        String minecraftversion = "java";
        String age = "16";

        // -- 2. the output (where the data is put together) --
        System.out.println("---To know about me---");
        System.out.println("My name is " + name + " i am " + age + " years old");
        System.out.println("i dream of having a " + whatiwant + " with many games such as " + whatiwant2 + " " + minecraftversion);
    }
}


