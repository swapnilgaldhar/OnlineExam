package com.example.onlineexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class StudentLogin extends AppCompatActivity {

    Button button;
    EditText userid,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);
        button=findViewById(R.id.buttonl);
        userid=findViewById(R.id.et_user);
        password=findViewById(R.id.et_pass);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(StudentLogin.this, "You Are Success Full LogIn", Toast.LENGTH_SHORT).show();
            }
        });
    }
}