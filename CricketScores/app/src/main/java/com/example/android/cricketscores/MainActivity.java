package com.example.android.cricketscores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int runsTeamA = 0;
    int runsTeamB = 0;
    int outsTeamA = 0;
    int outsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //team A
    public void sixTeamA(View view) {
        runsTeamA = runsTeamA + 6;
        displayForTeamA(runsTeamA);
    }

    public void fourTeamA(View view) {
        runsTeamA = runsTeamA + 4;
        displayForTeamA(runsTeamA);
    }

    public void twoTeamA(View view) {
        runsTeamA = runsTeamA + 2;
        displayForTeamA(runsTeamA);
    }

    public void oneTeamA(View view) {
        runsTeamA = runsTeamA + 1;
        displayForTeamA(runsTeamA);
    }

    public void incOutA(View view) {
        outsTeamA = outsTeamA + 1;
        displayoutsForTeamA(outsTeamA);
    }

    //team B
    public void sixTeamB(View view) {
        runsTeamB = runsTeamB + 6;
        displayForTeamB(runsTeamB);
    }

    public void fourTeamB(View view) {
        runsTeamB = runsTeamB + 4;
        displayForTeamB(runsTeamB);
    }

    public void twoTeamB(View view) {
        runsTeamB = runsTeamB + 2;
        displayForTeamB(runsTeamB);
    }

    public void oneTeamB(View view) {
        runsTeamB = runsTeamB + 1;
        displayForTeamB(runsTeamB);
    }

    public void incOutB(View view) {
        outsTeamB = outsTeamB + 1;
        displayoutsForTeamB(outsTeamB);
    }

    //reset button

    public void reset(View view) {
        runsTeamA = 0;
        runsTeamB = 0;
        outsTeamA = 0;
        outsTeamB = 0;
        displayForTeamA(runsTeamA);
        displayForTeamB(runsTeamB);
        displayoutsForTeamA(outsTeamA);
        displayoutsForTeamB(outsTeamB);
    }

    public void displayForTeamA(int runsTeamA) {
        TextView runsTeamAView = (TextView) findViewById(R.id.team_a_runs);
        runsTeamAView.setText(String.valueOf(runsTeamA));
    }

    public void displayoutsForTeamA(int outsTeamA) {
        TextView outsTeamAView = (TextView) findViewById(R.id.team_a_outs);
        outsTeamAView.setText(String.valueOf(outsTeamA));
    }

    public void displayForTeamB(int runsTeamB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_runs);
        scoreView.setText(String.valueOf(runsTeamB));
    }

    public void displayoutsForTeamB(int outsTeamB) {
        TextView outsTeamBView = (TextView) findViewById(R.id.team_b_outs);
        outsTeamBView.setText(String.valueOf(outsTeamB));
    }
}