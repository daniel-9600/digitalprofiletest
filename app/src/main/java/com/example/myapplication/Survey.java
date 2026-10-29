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
        Button exitSurveyButton = (Button) findViewById(R.id.exitSurveyButton);
        // exitSurveyButton object to be used

        exitSurveyButton.setOnClickListener(new View.OnClickListener() {
            // this method will make the exitSurveyButton switch to the main menu screen when pressed.
            @Override
            public void onClick(View view) {
                Intent moveToMainMenu = new Intent(Survey.this, MainMenu.class);
                startActivity(moveToMainMenu);
            }
        });
    }
}