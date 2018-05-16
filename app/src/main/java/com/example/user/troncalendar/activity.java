package com.example.user.troncalendar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class activity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);
        ImageView imageView = findViewById(R.id.imageView6);
        ImageView imageView4 = findViewById(R.id.imageView7);
        ImageView imageView2 = findViewById(R.id.imageView9);
        ImageView imageView3 = findViewById(R.id.imageView13);
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
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startNextPage4();
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
        intent.setClass(this , profile.class);
        startActivity(intent);
    }

    private void startNextPage3(){
        Intent intent = new Intent();
        intent.setClass(this , schoolpost.class);
        startActivity(intent);
    }

    private void startNextPage4(){
        Intent intent = new Intent();
        intent.setClass(this , calendar.class);
        startActivity(intent);
    }
}
