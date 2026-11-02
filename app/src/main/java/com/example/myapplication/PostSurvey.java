package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PostSurvey extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_postsurvey);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button retakeSurveyYesButton = (Button) findViewById(R.id.retakeSurveyYes);
        Button retakeSurveyNoButton = (Button) findViewById(R.id.retakeSurveyNo);
        // initialize buttons for later

        retakeSurveyYesButton.setOnClickListener(new View.OnClickListener() {
            // this method makes the screen switch to survey when retakeSurveyYesButton is pressed
            @Override
            public void onClick(View view) {
                Intent moveToSurvey = new Intent(PostSurvey.this, Survey.class);
                startActivity(moveToSurvey);
            }
        });
        retakeSurveyNoButton.setOnClickListener(new View.OnClickListener() {
            // this method makes the screen switch to main menu when retakeSurveyNoButton is pressed
            @Override
            public void onClick(View view) {
                Intent moveToMainMenu = new Intent(PostSurvey.this, MainMenu.class);
                startActivity(moveToMainMenu);
            }
        });
    }
}