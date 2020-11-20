package com.example.simplyplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class Rate extends AppCompatActivity {
Button fed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate);

        fed = (Button) findViewById(R.id.button_feed) ;
        Intent caller = getIntent();

    }

    public void submit(View v){
        RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        float rating = ratingBar.getRating();
        TextView textView = (TextView) findViewById(R.id.rateview);
        textView.setText("Your Rated " + rating);
    }
    public void  submitFed(View v){
        if(v.equals(fed))
            Toast.makeText(getApplicationContext(),
                    "Thanks For Your Feedback.",
                    Toast.LENGTH_SHORT).show();
    }
    public void back(View v){
        Intent gotoMainActivity = new Intent();
        gotoMainActivity.setClass(this, MainActivity.class);
        startActivity(gotoMainActivity);
        finish();
    }
}
