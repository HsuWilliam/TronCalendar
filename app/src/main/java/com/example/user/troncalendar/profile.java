package com.example.user.troncalendar;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class profile extends AppCompatActivity {
    private BottomNavigationView pro_nav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        pro_nav = findViewById(R.id.nav_profile);
        TextView textView4 = findViewById(R.id.textView4);
        pro_nav.setSelectedItemId(R.id.nav_profile);
        pro_nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_calendar :
                        startNextPage3();
                        return true;
                    case R.id.nav_activities:
                        startNextPage2();
                        return true;
                    case R.id.nav_course:
                        startNextPage();
                        return true;
                    default:
                        return false;
                }
            }
        });

//        ImageView imageView4 = findViewById(R.id.imageView12);



        String title = "個人資料";
        textView4.setText(title);

//        imageView4.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                nextPageToLogin();
//            }
//        });
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
