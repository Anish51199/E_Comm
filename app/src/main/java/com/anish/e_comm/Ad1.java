package com.anish.e_comm;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toolbar;

public class Ad1 extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad1);
        assert getSupportActionBar() != null;   //null check
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Ad1");
        imageView=findViewById(R.id.imageView2);
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }

    //and this to handle actions
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.action_settings) {
            Intent i=new Intent(this,PaymentPage.class);
            startActivity(i);
            return true;
        }
        if (id == R.id.search) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void setImage1(View view){
        imageView.setImageResource(R.drawable.beer);
    }
    public void setImage2(View view){
        imageView.setImageResource(R.drawable.greece);
    }
    public void setImage3(View view){
        imageView.setImageResource(R.drawable.palm);
    }
    public void setImage4(View view) {
        imageView.setImageResource(R.drawable.air);
    }
}
