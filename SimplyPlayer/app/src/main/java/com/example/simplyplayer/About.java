package com.example.simplyplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Intent caller = getIntent();
    }

    public void back(View v){
        Intent gotoAbout = new Intent();
        gotoAbout.setClass(this, MainActivity.class);
        startActivity(gotoAbout);
        finish();
    }
}
