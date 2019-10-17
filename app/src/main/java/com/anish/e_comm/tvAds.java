package com.anish.e_comm;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tvAds extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tv_ads);
    }
    public void ClickAd1(View view){
        Intent i=new Intent(this,Ad1.class);
        startActivity(i);
    }

    @Override
    public void onBackPressed() {
        finish();
        super.onBackPressed();
    }
}
