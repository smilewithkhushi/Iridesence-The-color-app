package com.example.iridescencethecolorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button ButtonRed, ButtonGreen, ButtonBlue,ButtonGray, ButtonOrange;
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButtonRed = findViewById(R.id.radioButtonRed);
        ButtonGreen = findViewById(R.id.radioButtonGreen);
        ButtonBlue = findViewById(R.id.radioButtonBlue);
        ButtonOrange = findViewById(R.id.radioButtonOrange);
        ButtonGray = findViewById(R.id.radioButtonGray);
        relativeLayout = findViewById(R.id.relativeLayout);

        // Set OnClickListener on each RadioButton
        ButtonRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Red Button Pressed", Toast.LENGTH_SHORT).show();
                relativeLayout.setBackgroundColor(Color.RED);
            }
        });

        ButtonGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Green Button Pressed", Toast.LENGTH_SHORT).show();
                relativeLayout.setBackgroundColor(Color.GREEN);
            }
        });

        ButtonBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Blue Button Pressed", Toast.LENGTH_SHORT).show();
                relativeLayout.setBackgroundColor(Color.BLUE);
            }
        });

        ButtonOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Yellow Button Pressed", Toast.LENGTH_SHORT).show();
                relativeLayout.setBackgroundColor(Color.YELLOW);
            }
        });

        ButtonGray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Gray Button Pressed", Toast.LENGTH_SHORT).show();
                relativeLayout.setBackgroundColor(Color.GRAY);
            }
        });
    }

}