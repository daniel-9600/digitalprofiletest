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

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_menu);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button startSurvey = (Button) findViewById(R.id.startSurveyButton);
        // startSurveyButton object to be used

        startSurvey.setOnClickListener(new View.OnClickListener() {
            // this method will make the startSurveyButton switch to the survey screen when pressed.
            @Override
            public void onClick(View view) {
                Intent moveToSurvey = new Intent(MainMenu.this, Survey.class); {
                    startActivity(moveToSurvey);
                }
            }
        });
        Button possibleCourses = (Button) findViewById(R.id.possibleCoursesButton);
        // possibleCoursesButton object to be used
        possibleCourses.setOnClickListener(new View.OnClickListener() {
            // same thing, possible courses button switches to possible courses screen when pressed.
            @Override
            public void onClick(View view) {
                Intent moveToPossibleCourses = new Intent(MainMenu.this, viewRelatedCourses.class); {
                    startActivity(moveToPossibleCourses);
                }
            }
        });
    }
}