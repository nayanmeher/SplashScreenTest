package com.kellton.splashscreentest;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import static java.lang.Float.sum;

public class LoginActivity extends AppCompatActivity {
    public static final String TAG = "LoginActivity";

    private Button loginBtn;
    private EditText loginUserName;
    private TextView tvForgotPwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tvForgotPwd = findViewById(R.id.txt_forgot_pwd);
        loginUserName = findViewById(R.id.login_uname);


        loginBtn = findViewById(R.id.login_btn);

//        loginBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(getApplicationContext(), DashBoardActivity.class));
//            }
//        });

        //without method reference
//        loginBtn.setOnClickListener( view ->
//                startActivity(new Intent(getApplicationContext(), DashBoardActivity.class)));

       // loginBtn.setOnClickListener(view -> handleClick(view));
        tvForgotPwd.setOnClickListener(view -> handleTost(view));

        //with method reference
        loginBtn.setOnClickListener(this::handleClick);

        // TODO: 4/10/19  do this with functional interface


    }

    public void handleClick(View view){
        //Snackbar.make(view, "Hello snake", Snackbar.LENGTH_SHORT).show();
        startActivity(new Intent(getApplicationContext(), DashBoardActivity.class));
    }
    public void handleTost(View view){

        Toast.makeText(getApplicationContext(), "hello Toast", Toast.LENGTH_SHORT).show();
    }

}
