package com.example.pickerfordate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button dateButton = findViewById(R.id.date_button);
        dateButton.setOnClickListener(this::showDatePicker);
    }

    public void showDatePicker(View view) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }

    public void processDatePickerResult(int year, int month, int day) {
        String yearString = Integer.toString(year);
        String monthString = Integer.toString(month + 1);
        String dayString = Integer.toString(day);

        String dateMessage = monthString + "/" + dayString + "/" + yearString;

        Toast.makeText(this, dateMessage, Toast.LENGTH_SHORT).show();
    }
}