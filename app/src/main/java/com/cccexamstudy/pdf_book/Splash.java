package com.cccexamstudy.pdf_book;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import static java.lang.Thread.sleep;

public class Splash extends AppCompatActivity {

    private static final int SPLASH_TIME_OUT = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread thread= new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(SPLASH_TIME_OUT);

                    Intent it= new Intent(Splash.this,MainActivity.class);
                    startActivity(it);

                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        thread.start();






    }
}
