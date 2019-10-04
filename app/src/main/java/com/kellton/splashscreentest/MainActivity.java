package com.kellton.splashscreentest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
            }
        }, 2000);*/

        //with lamda expression
        new Handler().postDelayed(() ->{
                    startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                    finish();
                }
                , 2000);


//        When we are calling postDelayed() function, we are passing an anonymous
//        function as it's parameter (It will automatically override run() method of the Runnable interface)
//        followed by -> operator (arrow operator) which is basically used for defining the body of the function.
//
//        When there is only one line of statement in the function body,
//        then we can only pass -> operator to define it's body.
//        But, when there are more than one line of statements in the function body,
//        then, we have to define the function body by the following way () -> { } Here,
//        curly braces are added to define the function body.



    }


}
