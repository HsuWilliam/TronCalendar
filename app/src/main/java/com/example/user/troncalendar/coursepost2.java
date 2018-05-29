package com.example.user.troncalendar;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class coursepost2 extends AppCompatActivity {
    private BottomNavigationView courseNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coursepost2);
        courseNav = (BottomNavigationView) findViewById(R.id.course_nav);
        Button button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startNextPage();
            }
        });

        TextView textView4 = findViewById(R.id.textView4);
        String title = "佈告欄";
        textView4.setText(title);

    }

    private void startNextPage(){
        Intent intent = new Intent();
        intent.setClass(this , coursepost1.class);
        startActivity(intent);
    }

}

