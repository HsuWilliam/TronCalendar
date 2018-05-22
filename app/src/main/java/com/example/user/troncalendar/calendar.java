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

public class calendar extends AppCompatActivity {
    private BottomNavigationView cal_nav;
    static Intent intent = new Intent();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar);
        TextView textView4 = findViewById(R.id.textView4);
        ImageView imageView1 = findViewById(R.id.imageView15);
        cal_nav = findViewById(R.id.cal_nav);
        cal_nav.setSelectedItemId(R.id.nav_calendar);
        cal_nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.nav_activities :
                        startNextPage2();
                        return true;
                    case R.id.nav_profile:
                        startNextPage3();
                        return true;
                    case R.id.nav_course:
                        startNextPage();
                        return true;
                    default:
                        return false;
                }
            }
        });
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startNextPage4();
            }
        });
        TextView textView4 = findViewById(R.id.textView4);
        String title = "行事曆";
        textView4.setText(title);
    }

    private void startNextPage(){
        intent.setClass(this , course.class);
        startActivity(intent);
    }

    private void startNextPage2(){
        intent.setClass(this , activity.class);
        startActivity(intent);
    }

    private void startNextPage3(){
        intent.setClass(this , profile.class);
        startActivity(intent);
    }

    private void startNextPage4(){
        intent.setClass(this , addevent.class);
        startActivity(intent);
    }
}

