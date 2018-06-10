package com.example.user.troncalendar;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.squareup.picasso.Picasso;

public class schoolpost extends AppCompatActivity {
    private BottomNavigationView activity_nav;
    private RecyclerView mSchoolpost;
    private DatabaseReference mDatabase;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.schoolpost);

        mDatabase = FirebaseDatabase.getInstance().getReference("學校最新公告");
        mDatabase.keepSynced(true);
        mSchoolpost = (RecyclerView) findViewById(R.id.recyclerview2);
        mSchoolpost.setHasFixedSize(true);
        mSchoolpost.setLayoutManager(new LinearLayoutManager(this));
        activity_nav = findViewById(R.id.activity_nav);
        activity_nav.setSelectedItemId(R.id.nav_activities);
        TextView textView4 = findViewById(R.id.textView4);

//        ImageView imageView = findViewById(R.id.imageView6);
//        ImageView imageView2 = findViewById(R.id.imageView9);
//        ImageView imageView3 = findViewById(R.id.imageView7);
//        imageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startNextPage();
//            }
//        });
//        imageView2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startNextPage2();
//            }
//        });
//        imageView3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startNextPage3();
//            }
//        });

        activity_nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_calendar :
                        startNextPage4();
                        return true;
                    case R.id.nav_profile:
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

    private void startNextPage4(){
        Intent intent = new Intent();
        intent.setClass(this , calendar.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseRecyclerAdapter<schoolpostlist,postViewHolder>firebaseRecyclerAdapter = new FirebaseRecyclerAdapter<schoolpostlist, postViewHolder>
                (schoolpostlist.class,R.layout.schoolpost_row,postViewHolder.class,mDatabase) {
            @Override
            protected void populateViewHolder(postViewHolder viewHolder, schoolpostlist model, int position) {
                viewHolder.setTitle(model.getTitle());
                viewHolder.setTime(model.getTime());
            }
        };
        mSchoolpost.setAdapter(firebaseRecyclerAdapter);
    }
    public static class postViewHolder extends RecyclerView.ViewHolder{
        View mView;
        public postViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
        }
        public void setTitle(String title){
            TextView post_schoolpost = (TextView)mView.findViewById(R.id.post_schoolpost);
            post_schoolpost.setText(title);
        }
        public void setTime(String time){
            TextView post_schooltime     = (TextView)mView.findViewById(R.id.post_schooltime);
            post_schooltime.setText(time);
        }

    }
}

