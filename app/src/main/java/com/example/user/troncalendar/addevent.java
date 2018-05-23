package com.example.user.troncalendar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.TimePickerDialog;
import android.app.TimePickerDialog.OnTimeSetListener;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.time.Month;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class addevent extends AppCompatActivity {
    private Button doSetDate;
    private Button doSetDate2;
    //private Button doSetTime;
    private TextView textDate;
    private TextView textDate2;
    //private TextView textTime;
    private DatePickerDialog datePickerDialog;
    private DatePickerDialog datePickerDialog2;
    //private TimePickerDialog timePickerDialog;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.addevent);
        doFindView();
        GregorianCalendar calendar = new GregorianCalendar();

        datePickerDialog = new DatePickerDialog(this, new OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                textDate.setText(year + "/" + (month+1) + "/" + dayOfMonth);
            }
        }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH));

      //  timePickerDialog = new TimePickerDialog(this, new OnTimeSetListener() {
         //   @Override
        //    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        //        textTime.setText((hourOfDay > 12 ? hourOfDay - 12 : hourOfDay) + ":"
        //         + minute + ":" + (hourOfDay > 12 ? "PM" : "AM"));
        //    }
        //}, calenda    r.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE), false);
        datePickerDialog2 = new DatePickerDialog(this, new OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                textDate2.setText(year + "/" + (month+1) + "/" + dayOfMonth);
            }
        }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH));
    }

    public void doFindView() {
        doSetDate = findViewById(R.id.button4);
        doSetDate2 = findViewById(R.id.button6);
        textDate = findViewById(R.id.textView9);
        textDate2 = findViewById(R.id.textView10);
    }

    public void setDate(View v) {
        datePickerDialog.show();
    }

    public void setDate2(View v) {
        datePickerDialog2.show();
    }

   // public void setTime(View v) {
   //     timePickerDialog.show();
   // }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.date, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
