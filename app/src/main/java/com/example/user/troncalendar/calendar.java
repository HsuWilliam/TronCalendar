package com.example.user.troncalendar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class calendar extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar);
        ImageView imageView = findViewById(R.id.imageView6);
        ImageView imageView2 = findViewById(R.id.imageView8);
        ImageView imageView3 = findViewById(R.id.imageView9);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startNextPage();
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startNextPage2();
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startNextPage3();
            }
        });
    }

    private void startNextPage(){
        Intent intent = new Intent();
        intent.setClass(this , course.class);
        startActivity(intent);
    }

    private void startNextPage2(){
        Intent intent = new Intent();
        intent.setClass(this , activity.class);
        startActivity(intent);
    }

    private void startNextPage3(){
        Intent intent = new Intent();
        intent.setClass(this , profile.class);
        startActivity(intent);
    }
}

