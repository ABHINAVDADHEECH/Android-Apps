package com.example.abhinav.bulbglowing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void lightson(View view){
        ImageView glow = (ImageView)findViewById(R.id.glow);
        ImageView off = (ImageView)findViewById(R.id.off);
        glow.animate().alpha(0).setDuration(1000);
        off.animate().alpha(1).setDuration(1000);


    }

    public void lightsoff(View view){
        ImageView glow = (ImageView)findViewById(R.id.glow);
        ImageView off = (ImageView)findViewById(R.id.off);
        glow.animate().alpha(1).setDuration(1000);
        off.animate().alpha(0).setDuration(1000);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
