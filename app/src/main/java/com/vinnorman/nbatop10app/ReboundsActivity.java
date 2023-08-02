package com.vinnorman.nbatop10app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class ReboundsActivity extends AppCompatActivity {

    ListView reboundsView;

    Button homeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rebounds);

        reboundsView = findViewById(R.id.rebounds_list_view);

        homeButton = findViewById(R.id.home_button);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homePageActivity = new Intent(ReboundsActivity.this, MainActivity.class);

                startActivity(homePageActivity);
            }
        });

        Data[] reboundsArray = {
                new Data("1. ", "Wilt Chamberlain", 23924),
                new Data("2. ", "Bill Russell", 21620),
                new Data("3. ", "Kareem Abdul-Jabbar", 17440),
                new Data("4. ", "Elvin Hayes", 16279),
                new Data("5. ", "Moses Malone", 16212),
                new Data("6. ", "Tim Duncan", 15091),
                new Data("7. ", "Karl Malone", 14968),
                new Data("8. ", "Robert Parish", 14715),
                new Data("9. ", "Kevin Garnett", 14662),
                new Data("10. ", "Dwight Howard", 14627)
        };

        ArrayAdapter<Data> reboundsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, reboundsArray);

        reboundsView.setAdapter(reboundsAdapter);
    }
}