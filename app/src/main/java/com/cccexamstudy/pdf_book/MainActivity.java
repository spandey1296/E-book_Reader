package com.cccexamstudy.pdf_book;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button study1,study2,study3,study4,study5,study6,study7,study8,study9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        study1 = (Button) findViewById(R.id.study1);
        study1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Study1Activity.class);
                startActivity(intent);

            }
        });

        study2 = (Button) findViewById(R.id.study2);
        study2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Study2Activity.class);
                startActivity(intent);

            }
        });


        study3 = (Button) findViewById(R.id.study3);
        study3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Study3Activity.class);
                startActivity(intent);

            }
        });

        study4 = (Button) findViewById(R.id.study4);
        study4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Study4Activity.class);
                startActivity(intent);

            }
        });

        study5 = (Button) findViewById(R.id.study5);
        study5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Study5Activity.class);
                startActivity(intent);

            }
        });




        study6 = (Button) findViewById(R.id.study6);
        study6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Study6Activity.class);
                startActivity(intent);

            }
        });


        study7 = (Button) findViewById(R.id.study7);
        study7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Study7Activity.class);
                startActivity(intent);

            }
        });


        study8 = (Button) findViewById(R.id.study8);
        study8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Study8Activity.class);
                startActivity(intent);

            }
        });

        study9= (Button) findViewById(R.id.study9);
        study9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Study9Activity.class);
                startActivity(intent);

            }
        });






    }
}
