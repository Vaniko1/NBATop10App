package com.vinnorman.nbatop10app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class PointsActivity extends AppCompatActivity {

    Button homeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_points);

        ListView pointsList = findViewById(R.id.points_list_view);

        homeButton = findViewById(R.id.home_button);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homePageActivity = new Intent(PointsActivity.this, MainActivity.class);

                startActivity(homePageActivity);
            }
        });

        Data[] pointsArray = {
                new Data("1. ", "Lebron James", 38652),
                new Data("2. ", "Kareem Abdul-Jabbar", 38387),
                new Data("3. ", "Karl Malone", 36928),
                new Data("4. ", "Kobe Bryant", 33643),
                new Data("5. ", "Michael Jordan", 32292),
                new Data("6. ", "Dirk Nowitzki", 31560),
                new Data("7. ", "Wilt Chamberlain", 31419),
                new Data("8. ", "Shaquille O'Neal", 28596),
                new Data("9. ", "Carmelo Anthony", 28289),
                new Data("10. ", "Moses Malone", 27409)
        };

        ArrayAdapter<Data> pointsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, pointsArray);

        pointsList.setAdapter(pointsAdapter);

    }
}