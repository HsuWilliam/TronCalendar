package com.example.user.troncalendar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class profile extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
TextView textView4 = findViewById(R.id.textView4);
        ImageView imageView = findViewById(R.id.imageView6);
        ImageView imageView2 = findViewById(R.id.imageView8);
        ImageView imageView3 = findViewById(R.id.imageView7);
        ImageView imageView4 = findViewById(R.id.imageView12);


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

        String title = "個人資料";
        textView4.setText(title);

        imageView4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                nextPageToLogin();
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
        intent.setClass(this , calendar.class);
        startActivity(intent);
    }

    private void nextPageToLogin(){
        Intent intent = new Intent();
        intent.setClass(this, MainActivity.class);
        startActivity(intent);
    }
}
