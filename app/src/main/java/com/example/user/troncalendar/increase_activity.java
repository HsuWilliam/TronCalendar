package com.example.user.troncalendar;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class increase_activity extends AppCompatActivity {
     EditText inserttitle,insertcontent,inserttime,insertplace;
     Button insert,cancel;
     FirebaseDatabase firebaseDatabase;
     FirebaseDatabase firebaseDatabase2;
     DatabaseReference databaseReference;
     DatabaseReference databaseReference2;
    private BottomNavigationView cal_nav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_increase_activity);
        inserttitle = findViewById(R.id.editText4);
        insertcontent = findViewById(R.id.editText5);
        inserttime = findViewById(R.id.editText7);
        insert = findViewById(R.id.button7);
        cancel = findViewById(R.id.button8);
        insertplace = findViewById(R.id.editText9);

       databaseReference = firebaseDatabase.getInstance().getReference("系學會");
       databaseReference2 = firebaseDatabase2.getInstance().getReference("社團");
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(insertplace.getText().toString().equals("系學會")) {
                    addArrayList();
                }else if(insertplace.getText().toString().equals("社團")){
                    addArrayList2();
                }
           }
        });



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

    private void addArrayList(){
        String title = inserttitle.getText().toString().trim();
        String time  = inserttime.getText().toString().trim();
        String content = insertcontent.getText().toString().trim();

        if(TextUtils.isEmpty(title)){
            Toast.makeText(this,"Please enter the title!",Toast.LENGTH_LONG).show();
        }else if(TextUtils.isEmpty(time)){
            Toast.makeText(this,"Please enter the time!",Toast.LENGTH_LONG).show();
        }else if(TextUtils.isEmpty(content)){
            Toast.makeText(this,"Please enter the content!",Toast.LENGTH_LONG).show();
        }else{
            String id = databaseReference.push().getKey();
            databaseReference.child(id).child("title").setValue(title.toString());
            databaseReference.child(id).child("time").setValue(time.toString());
            databaseReference.child(id).child("content").setValue(content.toString());
            Toast.makeText(this,"Activity is added",Toast.LENGTH_LONG).show();
            ClearTxt();
        }

        }
        private void ClearTxt(){
            inserttitle.setText("");
            inserttime.setText("");
            insertcontent.setText("");
            insertplace.setText("");
        }

        private void addArrayList2(){
            String title = inserttitle.getText().toString().trim();
            String time  = inserttime.getText().toString().trim();
            String content = insertcontent.getText().toString().trim();

            if(TextUtils.isEmpty(title)){
                Toast.makeText(this,"Please enter the title!",Toast.LENGTH_LONG).show();
            }else if(TextUtils.isEmpty(time)){
                Toast.makeText(this,"Please enter the time!",Toast.LENGTH_LONG).show();
            }else if(TextUtils.isEmpty(content)){
                Toast.makeText(this,"Please enter the content!",Toast.LENGTH_LONG).show();
            }else{
                String id2 = databaseReference2.push().getKey();
                databaseReference2.child(id2).child("title").setValue(title.toString());
                databaseReference2.child(id2).child("time").setValue(time.toString());
                databaseReference2.child(id2).child("content").setValue(content.toString());
                Toast.makeText(this,"Activity is added",Toast.LENGTH_LONG).show();
                Clear2Txt();
            }
        }
        private void Clear2Txt(){
            inserttitle.setText("");
            inserttime.setText("");
            insertcontent.setText("");
            insertplace.setText("");
        }

}
