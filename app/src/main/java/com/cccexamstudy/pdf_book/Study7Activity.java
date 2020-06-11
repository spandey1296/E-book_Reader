package com.cccexamstudy.pdf_book;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Study7Activity extends AppCompatActivity {

    PDFView study7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study7);


        study7=(PDFView) findViewById(R.id.pdfView7);
        study7.fromAsset("python.pdf").load();


    }
}
