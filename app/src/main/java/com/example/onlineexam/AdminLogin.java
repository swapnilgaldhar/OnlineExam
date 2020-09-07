package com.example.onlineexam;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AdminLogin extends AppCompatActivity {

    Button btn_l;
    EditText id,password;
    TextView textView1,textView2,textView4,textView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        id=findViewById(R.id.et_user_id);
        textView1=findViewById(R.id.tv_user_id);
        textView2=findViewById(R.id.tv_password);
        textView4=findViewById(R.id.textView);
        password=findViewById(R.id.et_password);
        btn_l=findViewById(R.id.btn_login);

        btn_l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent intent = new Intent(AdminLogin.this, AdminNavigationDraver.class);
                startActivity(intent);*/
                Toast.makeText(AdminLogin.this, "You Are Success Full LogIn", Toast.LENGTH_SHORT).show();
            }
        });


    }
}