package com.example.user.troncalendar;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class homework2 extends AppCompatActivity {
    private BottomNavigationView courseNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homework2);
        courseNav = (BottomNavigationView) findViewById(R.id.course_nav);
        Button button15 = findViewById(R.id.button15);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startNextPage();
            }
        });



        TextView textView4 = findViewById(R.id.textView4);
        String title = "作業";
        textView4.setText(title);

    }

    private void startNextPage(){
        Intent intent = new Intent();
        intent.setClass(this , homework1.class);
        startActivity(intent);
    }



}

