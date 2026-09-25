package com.example.myapplication.quarter2.practicalexam;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class RazonGymAccesTest {
    @Test
    public void testGymFlow() {
        StringBuilder automatedInput = new StringBuilder();
        System.out.println("--- GENERATING GYM TEST DATA ---");
// Step 1: Met the Gym worker, and asks if you have guts to buy a gym membership
        automatedInput.append("1\n"); // Instigated by the Gym worker, and you chose to agree to the offer.
// Step 2: So you bring out your wallet..
        automatedInput.append("9\n"); // That the money you hold are sufficient/insufficient for the Gym Membership.
// Step 3: Met the Gym worker, and asks if you have guts to buy a gym membership BUT you don't actually have the guts.
        automatedInput.append("2\n"); // Instigated by the Gym worker, but you chose to decline the offer.
// Step 4: Met the Gym worker, and asks if you have guts to buy a gym membership BUT you're just a wuss.
        automatedInput.append("3\n"); // You ran away from the Gym worker out of fear?

        System.out.println("--- TEST DATA GENERATION COMPLETE ---\n");
        ByteArrayInputStream inputStream = new ByteArrayInputStream(automatedInput.toString().getBytes());
        Scanner scanner = new Scanner(inputStream);
        RazonGymAccess gymSystem = new RazonGymAccess();
        gymSystem.start(scanner);
    }
}
// Commit wasnt in my name, but I'm going to add some while explaining the details of what I did one by one. Commit #4