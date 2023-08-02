package com.vinnorman.nbatop10app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class StealsActivity extends AppCompatActivity {

    ListView stealsView;

    Button homeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_steals);

        stealsView = findViewById(R.id.steals_list_view);

        homeButton = findViewById(R.id.home_button);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homePageActivity = new Intent(StealsActivity.this, MainActivity.class);

                startActivity(homePageActivity);
            }
        });

        Data[] stealsArray = {
                new Data("1. ", "John Stockton", 3265),
                new Data("2. ", "Jason Kidd", 2684),
                new Data("3. ","Chris Paul", 2544),
                new Data("4. ", "Michael Jordan", 2514),
                new Data("5. ","Gary Payton", 2445),
                new Data("6. ", "Maurice Cheeks", 2310),
                new Data("7. ", "Scottie Pippen", 2307),
                new Data("8. ", "Clyde Drexler", 2207),
                new Data("9. ", "LeBron James", 2186),
                new Data("10. ", "Hakeem Olajuwon", 2162)
        };

        ArrayAdapter<Data> stealsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, stealsArray);

        stealsView.setAdapter(stealsAdapter);

    }
}