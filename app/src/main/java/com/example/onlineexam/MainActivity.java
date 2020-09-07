package com.example.onlineexam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.onlineexam.navigationdraver.AdminNavigationDraver;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button btn_admin,btn_student,btn_assessor,btn_ssc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
             setContentView(R.layout.activity_main);

        btn_admin=findViewById(R.id.admin_login);
        btn_student=findViewById(R.id.student_login);
        btn_assessor=findViewById(R.id.assessor_login);
        btn_ssc=findViewById(R.id.ssc_login);

        btn_admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this, AdminNavigationDraver.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "HIIIIIIIII", Toast.LENGTH_SHORT).show();
            }
        });

        /*btn_admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,AdminLogin.class);
                startActivity(intent);
            }
        });
*/
        btn_assessor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent intent =new Intent(MainActivity.this,StudentLogin.class);
                startActivity(intent);*/
                Toast.makeText(MainActivity.this, "This is me Assessor", Toast.LENGTH_SHORT).show();
            }
        });

        btn_ssc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This is SSC", Toast.LENGTH_SHORT).show();
            }
        });

        btn_student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,AdminLogin.class);
                startActivity(intent);

            }
        });
    }
}