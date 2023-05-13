package com.example.menuinscription;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TextView;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

import kotlin.collections.UArraySortingKt;

public class Meteo extends AppCompatActivity {

    public int currentYear = 0;
    public int currentMonth = 0;
    public int currentDay = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meteo);
        CalendarView calendarView = findViewById(R.id.calendarView);
        final TextView selectedDay = findViewById(R.id.selectedDay);
        final TextView selectedMonth = findViewById(R.id.selectedMonth);
        final TextView selectedYear = findViewById(R.id.selectedYear);

        final List<String> calendarStrings =  new ArrayList<>();
        final int[] Days = new int[30];

        final EditText textInput = findViewById(R.id.textInput);

        final View dayCotent = findViewById(R.id.dayContent);



        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                selectedDay.setText("Selected Day " + dayOfMonth);
                selectedDay.setText("Selected month " + month);
                selectedDay.setText("Selected year " + year);
                currentYear = year;
                currentMonth = month;
                currentDay = dayOfMonth;
                if (dayCotent.getVisibility()==View.GONE);{
                    dayCotent.setVisibility(View.VISIBLE);
            }
            if(currentDay==Days[0]) {
                textInput.setText(calendarStrings.get(0));
            }

            }
        });

        final Button saveTextButton = findViewById(R.id.saveTextButton);


        saveTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Days[0]=currentDay;
                calendarStrings.add(textInput.getText().toString());
                textInput.setText("");

            }

        });
    }

}