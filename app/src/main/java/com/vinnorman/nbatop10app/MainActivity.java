package com.vinnorman.nbatop10app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView pointsTextView;
    TextView assistsTextView;
    TextView reboundsTextView;
    TextView stealsTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pointsTextView = findViewById(R.id.points_text_view);
        assistsTextView = findViewById(R.id.assists_text_view);
        reboundsTextView = findViewById(R.id.rebounds_text_view);
        stealsTextView = findViewById(R.id.steals_text_view);

        pointsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pointsActivityIntent = new Intent(MainActivity.this, PointsActivity.class);

                startActivity(pointsActivityIntent);
            }
        });
        assistsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent assistsActivityIntent = new Intent(MainActivity.this, AssistsActivity.class);

                startActivity(assistsActivityIntent);
            }
        });
        reboundsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reboundsActivityIntent = new Intent(MainActivity.this, ReboundsActivity.class);

                startActivity(reboundsActivityIntent);
            }
        });
        stealsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent stealsActivityIntent = new Intent(MainActivity.this, StealsActivity.class);

                startActivity(stealsActivityIntent);
            }
        });


    }

}