package com.herprogramacin.mybranch.UI;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.herprogramacin.mybranch.R;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img = (ImageView)findViewById(R.id.splashlogo);
        img.setBackgroundResource(R.drawable.splash_animation);

        // Get the background, which has been compiled to an AnimationDrawable object.
        AnimationDrawable frameAnimation = (AnimationDrawable) img.getBackground();

        // Start the animation (looped playback by default).
        frameAnimation.start();

        Thread logoTimer = new Thread(){
            public void run(){
                try{
                    int logoTimer = 0;
                    while(logoTimer < 2200){
                        sleep(100);
                        logoTimer = logoTimer +100;
                    }

                    startActivity(new Intent(getApplicationContext(), ActivityMenu.class));
                }
                catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

                finally{
                    finish();
                }
            }
        };
        logoTimer.start();


    }

}
