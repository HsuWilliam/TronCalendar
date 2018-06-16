package com.example.user.troncalendar;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class increase_activity extends AppCompatActivity {
    private BottomNavigationView cal_nav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_increase_activity);

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
    }
    private void startNextPage(){
        Intent intent = new Intent();
        intent.setClass(this ,course.class);
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
