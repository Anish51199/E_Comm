package com.anish.e_comm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SignUp extends AppCompatActivity {
    TextView SignIn;
    public void ClickOn(View view){
        Intent i=new Intent(this, Menu.class);
        startActivity(i);
        finish();
    }
    public void LogIn(View view){
        Intent i=new Intent(SignUp.this,SignIn.class);
        startActivity(i);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        getSupportActionBar().hide();
        SignIn=findViewById(R.id.SignIn);
    }
}
