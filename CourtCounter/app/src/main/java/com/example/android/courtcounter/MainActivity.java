package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA=0;
    int scoreTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given scoreTeamA for Team A.
     */
     public void three(View view)
     {
         scoreTeamA=scoreTeamA+3;
         displayForTeamA(scoreTeamA);
     }
    public void two(View view)
    {
        scoreTeamA=scoreTeamA+2;
        displayForTeamA(scoreTeamA);
    }
    public void one(View view)
    {
        scoreTeamA=scoreTeamA+1;
        displayForTeamA(scoreTeamA);
    }

    //for team B

    public void threeB(View view)
    {
        scoreTeamB=scoreTeamB+3;
        displayForTeamB(scoreTeamB);
    }
    public void twoB(View view)
    {
        scoreTeamB=scoreTeamB+2;
        displayForTeamB(scoreTeamB);
    }
    public void oneB(View view)
    {
        scoreTeamB=scoreTeamB+1;
        displayForTeamB(scoreTeamB);
    }

    //reset button

    public void reset(View view)
    {
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    public void displayForTeamA(int scoreTeamA) {
        TextView scoreTeamAView = (TextView) findViewById(R.id.team_a_score);
        scoreTeamAView.setText(String.valueOf(scoreTeamA));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
