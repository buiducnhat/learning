package com.example.simpleasynctask;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button startButton;
    TextView textView;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton = findViewById(R.id.button);
        textView = findViewById(R.id.textView1);
        progressBar = findViewById(R.id.progressBar);

        progressBar.setVisibility(ProgressBar.INVISIBLE);

        startButton.setOnClickListener(v -> {
            textView.setText(R.string.napping);
            progressBar.setVisibility(ProgressBar.VISIBLE);
            new SimpleAsyncTask(textView, progressBar).execute();
        });
    }
}