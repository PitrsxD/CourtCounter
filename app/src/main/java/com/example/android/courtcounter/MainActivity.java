package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int team_a_score = 0;
    int team_b_score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));

    }

    public void pointsThreeForA(View wiev) {
        team_a_score =  team_a_score + 3 ;
        displayForTeamA(team_a_score);
    }

    public void pointsTwoForA(View wiev) {
        team_a_score =  team_a_score + 2 ;
        displayForTeamA(team_a_score);
    }

    public void pointOneForA(View wiev) {
        team_a_score =  team_a_score + 1 ;
        displayForTeamA(team_a_score);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));

    }

    public void pointsThreeForB(View wiev) {
        team_b_score =  team_b_score + 3 ;
        displayForTeamB(team_b_score);
    }

    public void pointsTwoForB(View wiev) {
        team_b_score =  team_b_score + 2 ;
        displayForTeamB(team_b_score);
    }

    public void pointOneForB(View wiev) {
        team_b_score =  team_b_score + 1 ;
        displayForTeamB(team_b_score);
    }

    public void resetScore(View view) {
        displayForTeamB(team_b_score = 0);
        displayForTeamA(team_a_score = 0);
    }
}
