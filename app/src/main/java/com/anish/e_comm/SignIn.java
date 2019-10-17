package com.anish.e_comm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        getSupportActionBar().hide();
    }
    public void ClickOn(View view){
        Intent i=new Intent(this,
                SignUp.class);
        //Intent is used to switch from one activity to another.

        startActivity(i);
    }
    public void LogIn(View view){
        Intent i=new Intent(this, Menu.class);
        startActivity(i);
        finish();
    }
}
