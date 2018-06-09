package com.example.user.troncalendar;


import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.user.troncalendar.R;
import com.example.user.troncalendar.course;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
//import com.google.firebase.database.DataSnapshot;
//import com.google.firebase.database.DatabaseError;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;
//import com.google.firebase.database.ValueEventListener;


//test
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText studentnumber;
    EditText pass;
    private Button button;
    FirebaseAuth mAuth;
  //  ProgressBar progressbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAuth = FirebaseAuth.getInstance();
        findViewById(R.id.button).setOnClickListener(this);
        studentnumber = (EditText) this.findViewById(R.id.studentnumber);
        pass = (EditText) this.findViewById(R.id.password);
      //  progressbar = (ProgressBar) findViewById(R.id.progressbar);




        //  button.setOnClickListener(new View.OnClickListener() {
        //     @Override
        //    public void onClick(View v) {
        //     if (studentnumber.getText().toString().equals("405402340") && pass.getText().toString().equals("405402340") || studentnumber.getText().toString().equals("405402508") && pass.getText().toString().equals("405402508")
        //       ||studentnumber.getText().toString().equals("405402314") && pass.getText().toString().equals("405402314") || studentnumber.getText().toString().equals("405402089") && pass.getText().toString().equals("405402089")
        //       || studentnumber.getText().toString().equals("405402223") && pass.getText().toString().equals("405402223")) {
        //    Intent intent = new Intent();
        //     intent.setClass(MainActivity.this, course.class);
        //      startActivity(intent);

        //    }else{
        //      new AlertDialog.Builder(MainActivity.this).setTitle("登入訊息").setIcon(R.mipmap.ic_launcher).setMessage("密碼錯誤").setPositiveButton("返回"
        //             , new DialogInterface.OnClickListener() {
        //                @Override
        //                public void onClick(DialogInterface dialog, int which) {
        //                    Intent intent = new Intent();
        //                   intent.setClass(MainActivity.this,MainActivity.class);
        //                   startActivity(intent);
        //                  }
        //              }).show();

        //          }
        //       }
        //    }

     //   );
    }

    private void userlogin(){
        String email = studentnumber.getText().toString().trim();
        String password = pass.getText().toString().trim();

     //   progressbar.setVisibility(View.VISIBLE);
        mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Intent intent = new Intent(MainActivity.this,course.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(),task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
            userlogin();
            break;
        }

    }




    // };

    // test merges8787


    // @Override
    //    public void onClick(View v) {
    //          startNextPage();
    //      }
    //  });

    // }

//this is a test
//   private void startNextPage(){
    //    Intent intent = new Intent();
    //   intent.setClass(this , course.class);
    //   startActivity(intent);
    //   }

    //}
    // private void startNewPage(){
    //  Intent intent = new Intent();
    //   intent.setClass(this , course.class);
    //   startActivity(intent);
    //   }
}