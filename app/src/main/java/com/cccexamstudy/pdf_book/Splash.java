package com.cccexamstudy.pdf_book;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import static java.lang.Thread.sleep;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread thread= new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(500);

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
