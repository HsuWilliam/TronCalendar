package com.example.user.troncalendar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class course1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course1);
        //course
        TextView textView4 = findViewById(R.id.textView4);
        String title = "課程";
        textView4.setText(title);
    }
}
