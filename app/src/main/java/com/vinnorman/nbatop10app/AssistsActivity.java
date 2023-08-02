package com.vinnorman.nbatop10app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class AssistsActivity extends AppCompatActivity {

    ListView assistsView;

    Button homeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assists);

        assistsView = findViewById(R.id.assists_list_view);

        homeButton = findViewById(R.id.home_button);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homePageActivity = new Intent(AssistsActivity.this, MainActivity.class);

                startActivity(homePageActivity);
            }
        });

        Data[] assistsArray = {
                new Data("1. ", "John Stockton", 15806),
                new Data("2. ", "Jason Kidd", 12091),
                new Data("3. ", "Chris Paul", 11501),
                new Data("4. ", "LeBron James", 10420),
                new Data("5. ", "Steve Nash", 10335),
                new Data("6. ", "Mark Jackson", 10334),
                new Data("7. ", "Magic Johnson", 10141),
                new Data("8. ", "Oscar Robertson", 9887),
                new Data("9. ", "Russell Westbrook", 9162),
                new Data("10. ", "Isiah Thomas", 9061)
        };

        ArrayAdapter<Data> assistsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, assistsArray);

        assistsView.setAdapter(assistsAdapter);
    }
}