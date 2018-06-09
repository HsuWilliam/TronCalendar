package com.example.user.troncalendar;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
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

import org.w3c.dom.Text;

//import com.google.firebase.database.DataSnapshot;
//import com.google.firebase.database.DatabaseError;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;
//import com.google.firebase.database.ValueEventListener;

public class course extends AppCompatActivity {
    private BottomNavigationView courseNav;
    //  private CardView cardView1, cardView2, cardView3, cardView4;
    private CardView coursecard;
    private RecyclerView mCourse;
    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course);
        //coursecard = (CardView)findViewById(R.id.coursecard);
        mDatabase = FirebaseDatabase.getInstance().getReference("課程");
        mDatabase.keepSynced(true);
        mCourse = (RecyclerView) findViewById(R.id.recyclerview);
        mCourse.setHasFixedSize(true);
        mCourse.setLayoutManager(new LinearLayoutManager(this));



        //   cardView1 = findViewById(R.id.cardView1);
        //   cardView2 = findViewById(R.id.cardView2);
        //   cardView3 = findViewById(R.id.cardView3);
        //    cardView4 = findViewById(R.id.cardView4);
//        ListView listView = (ListView)findViewById(R.id.list);
//        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1);//使用ListAdapter來顯示你輸入的文字
//        listView.setAdapter(adapter);//將ListAdapter設定至ListView裡面
//        DatabaseReference reference  = FirebaseDatabase.getInstance().getReference("課程");
//        reference.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                adapter.clear();
//                for(DataSnapshot ds: dataSnapshot.getChildren()){
//                    adapter.add(ds.child("名稱").getValue().toString());
//                }
//
//            }
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//            }
//        });

        //  cardView1.setOnClickListener(new View.OnClickListener() {
        // @Override
        //   public void onClick(View v) {
        //    goToCard1();
        //  }
        //   });
        //  cardView2.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //     public void onClick(View v) {
        //         goToCard2();
        //      }
        //   });
        //    cardView3.setOnClickListener(new View.OnClickListener() {
        //   @Override
        //  public void onClick(View v) {
        //      goToCard3();
        //    }
        //  });
        //  cardView4.setOnClickListener(new View.OnClickListener() {
        //     @Override
        //     public void onClick(View v) {
        //     goToCard4();
        //   }
        //  });
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

    //   private void goToCard1(){
    //   Intent intent = new Intent();
    //   intent.setClass(getApplicationContext() , course1.class);
    //    startActivity(intent);
    //  }

    //  private void goToCard2(){
    //  Intent intent = new Intent();
    //   intent.setClass(getApplicationContext() , course2.class);
    //   startActivity(intent);
    //   }

    //  private void goToCard3(){
    //   Intent intent = new Intent();
    //   intent.setClass(getApplicationContext() , course3.class);
    //    startActivity(intent);
    // }

    //  private void goToCard4(){
    //     Intent intent = new Intent();
    //     intent.setClass(getApplicationContext(), course4.class);
    //     startActivity(intent);
    //   }
//    }

    @Override
    protected void onStart(){
        super.onStart();
        FirebaseRecyclerAdapter<courselist,courseViewHolder>firebaseRecyclerAdapter = new FirebaseRecyclerAdapter<courselist, courseViewHolder>
                (courselist.class,R.layout.course_row,courseViewHolder.class,mDatabase) {
            @Override
            protected void populateViewHolder(courseViewHolder viewHolder, courselist model, final int position) {
                viewHolder.setName(model.getName());
                viewHolder.setTeachername(model.getTeachername());
                viewHolder.setImage(getApplicationContext(),model.getImage());
                viewHolder.mView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                       if(position==0){
                           Intent intent = new Intent();
                           intent.setClass(course.this,course1.class);
                           startActivity(intent);
                       }else if(position==1){
                           Intent intent = new Intent();
                           intent.setClass(course.this,course2.class);
                           startActivity(intent);
                       }else if(position==2){
                           Intent intent = new Intent();
                           intent.setClass(course.this,course3.class);
                           startActivity(intent);
                       }else if(position==3){
                           Intent intent = new Intent();
                           intent.setClass(course.this,course4.class);
                           startActivity(intent);
                       }
                    }
            });
            }
        };
        mCourse.setAdapter(firebaseRecyclerAdapter);
    }
    public static class courseViewHolder extends RecyclerView.ViewHolder{
        View mView;
        public courseViewHolder(View itemView) {
            super(itemView);
            mView= itemView;
        }
        public void setName(String name){
            TextView post_name = (TextView)mView.findViewById(R.id.post_name);
            post_name.setText(name);
        }
        public void setTeachername(String teachername){
            TextView post_teachername = (TextView)mView.findViewById(R.id.post_teachername);
            post_teachername.setText(teachername);
        }
        public void setImage(Context ctx, String image){
            ImageView post_image = (ImageView)mView.findViewById(R.id.post_image);
            Picasso.with(ctx).load(image).into(post_image);
        }
    }
}