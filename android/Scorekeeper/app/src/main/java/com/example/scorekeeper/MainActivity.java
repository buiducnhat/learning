package com.example.scorekeeper;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private int mScore1, mScore2;
    private TextView mScoreText1, mScoreText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mScoreText1 = findViewById(R.id.score1);
        mScoreText2 = findViewById(R.id.score2);

        ImageButton mIncrement1 = findViewById(R.id.increaseTeam1);
        ImageButton mIncrement2 = findViewById(R.id.increaseTeam2);
        ImageButton mDecrement1 = findViewById(R.id.decreaseTeam1);
        ImageButton mDecrement2 = findViewById(R.id.decreaseTeam2);

        mIncrement1.setOnClickListener(v -> {
            increaseScore(1);
        });
        mIncrement2.setOnClickListener(v -> {
            increaseScore(2);
        });
        mDecrement1.setOnClickListener(v -> {
            decreaseScore(1);
        });
        mDecrement2.setOnClickListener(v -> {
            decreaseScore(2);
        });
    }

    public void increaseScore(int scoreTeam) {
        if (scoreTeam == 1) {
            mScore1++;
            mScoreText1.setText(String.valueOf(mScore1));
        } else {
            mScore2++;
            mScoreText2.setText(String.valueOf(mScore2));
        }
    }

    public void decreaseScore(int scoreTeam) {
        if (scoreTeam == 1) {
            mScore1--;
            mScoreText1.setText(String.valueOf(mScore1));
        } else {
            mScore2--;
            mScoreText2.setText(String.valueOf(mScore2));
        }
    }
}