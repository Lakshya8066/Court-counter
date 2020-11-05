package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0,scoreTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Increase the score for Team A by 3 points.
     * */
   public void addThreeForTeamA(View v)
   {
       scoreTeamA+=3;
       displayForTeamA(scoreTeamA);
   }
    /**
     * Increase the score for Team A by 2 points.
     * */
    public void addTwoForTeamA(View v)
    {
        scoreTeamA+=2;
        displayForTeamA(scoreTeamA);    }
    /**
     * Increase the score for Team A by 1 points.
     * */
    public void addOneForTeamA(View v)
    {
        scoreTeamA+=1;
        displayForTeamA(scoreTeamA);    }
    /**
     *
     *
     *
     *
     *
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Increase the score for Team B by 3 points.
     * */
    public void addThreeForTeamB(View v)
    {
        scoreTeamB+=3;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Increase the score for Team B by 2 points.
     * */
    public void addTwoForTeamB(View v)
    {
        scoreTeamB+=2;
        displayForTeamB(scoreTeamB);    }
    /**
     * Increase the score for Team B by 1 points.
     * */
    public void addOneForTeamB(View v)
    {
        scoreTeamB+=1;
        displayForTeamB(scoreTeamB);    }

    /**
     * This method resets the score of the both teams.
     */
    public void reset(View v)
    {
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * This method resets the score of the team which calls it.
     */
    public void resetTeamA(View v)
    {
        scoreTeamA=0;
        displayForTeamA(scoreTeamA);
    }
    public void resetTeamB(View v)
    {
        scoreTeamB=0;
        displayForTeamB(scoreTeamB);
    }


}