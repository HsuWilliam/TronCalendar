package com.example.user.troncalendar;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v7.app.ActionBar;
//import info.androidhive.bottomnavigation.fragment.CartFragment;
//import info.androidhive.bottomnavigation.fragment.GiftsFragment;
//import info.androidhive.bottomnavigation.fragment.ProfileFragment;
//import info.androidhive.bottomnavigation.fragment.StoreFragment;
//import info.androidhive.bottomnavigation.helper.BottomNavigationBehavior;

import org.w3c.dom.Text;

public class course extends AppCompatActivity {
    private BottomNavigationView courseNav;
    private CardView cardView1, cardView2, cardView3, cardView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        cardView1 = findViewById(R.id.cardView1);
        cardView2 = findViewById(R.id.cardView2);
        cardView3 = findViewById(R.id.cardView3);
        cardView4 = findViewById(R.id.cardView4);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToCard1();
            }
        });
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToCard2();
            }
        });
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToCard3();
            }
        });
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToCard4();
            }
        });

        super.onCreate(savedInstanceState);
        setContentView(R.layout.course);
        courseNav = (BottomNavigationView) findViewById(R.id.course_nav);
        courseNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_activities :
                        startNextPage2();
                        return true;
                    case R.id.nav_calendar:
                        startNextPage3();
                        return true;
                    case R.id.nav_profile:
                        startNextPage();
                        return true;
                    default:
                        return false;
                }
            }
        });
        TextView textView4 = findViewById(R.id.textView4);
        String title = "課程";
        textView4.setText(title);
    }



    private void startNextPage(){
        Intent intent = new Intent();
        intent.setClass(this , profile.class);
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

    private void goToCard1(){

    }

    private void goToCard2(){

    }

    private void goToCard3(){

    }

    private void goToCard4(){

    }







}
