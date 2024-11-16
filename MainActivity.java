package com.example.footballapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set data for Team A
        ImageView teamAImage = findViewById(R.id.teamAImage);
        teamAImage.setImageResource(R.drawable.team_a_image); // Replace with your image resource
        TextView teamA = findViewById(R.id.teamA);
        teamA.setText("Team A: Wins: 10, Draws: 5, Losses: 2");

        Button teamAButton = findViewById(R.id.buttonTeamA);
        teamAButton.setOnClickListener(v -> {
            // Display more information about Team A
            Toast.makeText(this, "Team A: Founded in 1900, 5-time champions", Toast.LENGTH_SHORT).show();
        });

        // Set data for Team B
        ImageView teamBImage = findViewById(R.id.teamBImage);
        teamBImage.setImageResource(R.drawable.team_b_image); // Replace with your image resource
        TextView teamB = findViewById(R.id.teamB);
        teamB.setText("Team B: Wins: 8, Draws: 6, Losses: 3");

        Button teamBButton = findViewById(R.id.buttonTeamB);
        teamBButton.setOnClickListener(v -> {
            // Display more information about Team B
            Toast.makeText(this, "Team B: Founded in 1920, 3-time champions", Toast.LENGTH_SHORT).show();
        });

        // Set data for Team C
        ImageView teamCImage = findViewById(R.id.teamCImage);
        teamCImage.setImageResource(R.drawable.team_c_image); // Replace with your image resource
        TextView teamC = findViewById(R.id.teamC);
        teamC.setText("Team C: Wins: 12, Draws: 3, Losses: 4");

        Button teamCButton = findViewById(R.id.buttonTeamC);
        teamCButton.setOnClickListener(v -> {
            // Display more information about Team C
            Toast.makeText(this, "Team C: Founded in 1950, 7-time champions", Toast.LENGTH_SHORT).show();
        });

        // Set data for Messi
        ImageView messiImage = findViewById(R.id.messiImage);
        messiImage.setImageResource(R.drawable.messi_image); // Replace with your image resource
        TextView messi = findViewById(R.id.messiStats);
        messi.setText("Lionel Messi: \nGoals: 750+ | Assists: 300+ | Ballon d'Or: 7");

        Button messiButton = findViewById(R.id.buttonMessi);
        messiButton.setOnClickListener(v -> {
            // Display more information about Messi
            Toast.makeText(this, "Messi: Widely regarded as one of the greatest footballers of all time, 7-time Ballon d'Or winner.", Toast.LENGTH_SHORT).show();
        });

        // Set data for Ronaldo
        ImageView ronaldoImage = findViewById(R.id.ronaldoImage);
        ronaldoImage.setImageResource(R.drawable.ronaldo_image); // Replace with your image resource
        TextView ronaldo = findViewById(R.id.ronaldoStats);
        ronaldo.setText("Cristiano Ronaldo: \nGoals: 800+ | Assists: 220+ | Ballon d'Or: 5");

        Button ronaldoButton = findViewById(R.id.buttonRonaldo);
        ronaldoButton.setOnClickListener(v -> {
            // Display more information about Ronaldo
            Toast.makeText(this, "Ronaldo: Known for his incredible work ethic and fitness, 5-time Ballon d'Or winner.", Toast.LENGTH_SHORT).show();
        });

        // Set data for Mbappé
        ImageView mbappeImage = findViewById(R.id.mbappeImage);
        mbappeImage.setImageResource(R.drawable.mbappe_image); // Replace with your image resource
        TextView mbappe = findViewById(R.id.mbappeStats);
        mbappe.setText("Kylian Mbappé: \nGoals: 220+ | Assists: 100+ | World Cup: 1");

        Button mbappeButton = findViewById(R.id.buttonMbappe);
        mbappeButton.setOnClickListener(v -> {
            // Display more information about Mbappé
            Toast.makeText(this, "Mbappé: One of the fastest players in the world, 2018 World Cup winner.", Toast.LENGTH_SHORT).show();
        });
    }
}
