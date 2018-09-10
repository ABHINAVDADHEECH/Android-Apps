package com.example.abhinav.drumpad;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {


    String Tag="Main Activity";
    Button one,two,three,four,five,six;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);




        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playMusic(view);
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playMusic(view);
            }


        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playMusic(view);
            }


        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playMusic(view);
            }


        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playMusic(view);
            }


        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playMusic(view);
            }


        });
    }

    public void playMusic(View view){
        int id=view.getId();
        Log.d(Tag,"playMusic:id"+id);
        String nameId=view.getResources().getResourceEntryName(id);
        Log.d(Tag,"playMusic:nameId"+nameId);
        int musicid=getResources().getIdentifier(nameId,"raw","com.example.abhinav.drumpad");
        MediaPlayer md= MediaPlayer.create(this,musicid);
        md.start();

//md.release();

    }
}
