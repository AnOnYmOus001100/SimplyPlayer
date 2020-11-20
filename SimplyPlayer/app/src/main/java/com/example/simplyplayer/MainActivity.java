package com.example.simplyplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    MediaPlayer Music;
    Button Next, Prev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent caller = getIntent();

        Next = (Button) findViewById(R.id.button_next);
        Prev = (Button) findViewById(R.id.button_prev);



        Music = MediaPlayer.create(this, R.raw.ncs4);
        Switch loop = (Switch) findViewById(R.id.loop);
        loop.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Music.setLooping(isChecked);
            }
        });

    }



    public void play(View v){
            Music.start();
    }
    public void pause(View v){
        if(Music.isPlaying())
            Music.pause();
    }
    public void stop(View v){
        Music.stop();
        finish();
    }
    public void prev(View v){
        if (v.equals(Prev))
            //pop-up
            Toast.makeText(getApplicationContext(),
                    "prev",
                    Toast.LENGTH_SHORT).show();
    }
    public void next(View v){
        if (v.equals(Next))
            //pop-up
            Toast.makeText(getApplicationContext(),
                    "next",
                    Toast.LENGTH_SHORT).show();
    }
    public  void rate(View v){
            Intent gotoRate = new Intent();
            gotoRate.setClass(this, Rate.class);
            startActivity(gotoRate);
            finish();
    }
    public void about(View v){
        Intent gotoAbout = new Intent();
        gotoAbout.setClass(this, About.class);
        startActivity(gotoAbout);
        finish();
    }
}
