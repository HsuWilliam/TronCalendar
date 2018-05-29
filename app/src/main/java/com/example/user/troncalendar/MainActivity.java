package com.example.user.troncalendar;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


//test
public class MainActivity extends AppCompatActivity {
    private EditText studentnumber;
    private EditText pass;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        studentnumber = (EditText) this.findViewById(R.id.studentnumber);
        pass = (EditText) this.findViewById(R.id.password);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (studentnumber.getText().toString().equals("405402340") && pass.getText().toString().equals("405402340") || studentnumber.getText().toString().equals("405402508") && pass.getText().toString().equals("405402508")
                        ||studentnumber.getText().toString().equals("405402314") && pass.getText().toString().equals("405402314") || studentnumber.getText().toString().equals("405402089") && pass.getText().toString().equals("405402089")
                        || studentnumber.getText().toString().equals("405402223") && pass.getText().toString().equals("405402223")) {
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, course.class);
                    startActivity(intent);

                }else{
                    new AlertDialog.Builder(MainActivity.this).setTitle("登入訊息").setIcon(R.mipmap.ic_launcher).setMessage("密碼錯誤").setPositiveButton("返回"
                                , new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent intent = new Intent();
                                        intent.setClass(MainActivity.this,MainActivity.class);
                                        startActivity(intent);
                                    }
                                }).show();

                    }
                }
            }
        );
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