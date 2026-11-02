package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Survey extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_survey);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button answerYesButton = (Button) findViewById(R.id.answerYesButton);
        Button answerNoButton = (Button) findViewById(R.id.answerNoButton);
        Button exitSurveyButton = (Button) findViewById(R.id.exitSurveyButton);
        //  initializing buttons for later
        final int[] questionNumber = {0};

        exitSurveyButton.setOnClickListener(new View.OnClickListener() {
            // this method will make the exitSurveyButton switch to the main menu screen when pressed.
            @Override
            public void onClick(View view) {
                Intent moveToMainMenu = new Intent(Survey.this, MainMenu.class);
                startActivity(moveToMainMenu);
            }
        });
        answerYesButton.setOnClickListener(new View.OnClickListener() {
            /* this method will display each question by changing the textview
            once questionNumber reaches 5, move to post survey screen
             */
            TextView questionNumberText = (TextView) findViewById(R.id.questionNumber);
            TextView questionBodyText = (TextView) findViewById(R.id.questionBody);
            @Override
            public void onClick(View view) {
                questionNumber[0]++;
                switch (questionNumber[0]) {
                    // questionNumber[0] starts at 0 and displays question #1
                    case 1:
                        questionNumberText.setText("QUESTION #2");
                        questionBodyText.setText("Are you a fan of numbers?");
                        break;
                    case 2:
                        questionNumberText.setText("QUESTION #3");
                        questionBodyText.setText("Do you enjoy solving and understand problems?");
                        break;
                    case 3:
                        questionNumberText.setText("QUESTION #4");
                        questionBodyText.setText("Do you like finding patterns in nature and numbers?");
                        break;
                    case 4:
                        questionNumberText.setText("QUESTION #5");
                        questionBodyText.setText("Do you like adding or subtracting random numbers you see?");
                        break;
                    case 5:
                        Intent moveToPostSurvey = new Intent(Survey.this, PostSurvey.class);
                        startActivity(moveToPostSurvey);
                }
            }
        });
        answerNoButton.setOnClickListener(new View.OnClickListener() {
            /* this method will display each question by changing the textview
            once questionNumber reaches 5, move to post survey screen
             */
            TextView questionNumberText = (TextView) findViewById(R.id.questionNumber);
            TextView questionBodyText = (TextView) findViewById(R.id.questionBody);
            @Override
            public void onClick(View view) {
                questionNumber[0]++;
                switch (questionNumber[0]) {
                    // questionNumber[0] displays question #1
                    case 1:
                        questionNumberText.setText("QUESTION #2");
                        questionBodyText.setText("Are you a fan of numbers?");
                        break;
                    case 2:
                        questionNumberText.setText("QUESTION #3");
                        questionBodyText.setText("Do you enjoy solving and understand problems?");
                        break;
                    case 3:
                        questionNumberText.setText("QUESTION #4");
                        questionBodyText.setText("Do you like finding patterns in nature and numbers?");
                        break;
                    case 4:
                        questionNumberText.setText("QUESTION #5");
                        questionBodyText.setText("Do you like adding or subtracting random numbers you see?");
                        break;
                    case 5:
                        Intent moveToPostSurvey = new Intent(Survey.this, PostSurvey.class);
                        startActivity(moveToPostSurvey);
                }
            }
        });
    }
}