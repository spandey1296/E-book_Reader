package com.cccexamstudy.pdf_book;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Study8Activity extends AppCompatActivity {

    PDFView study8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study7);


        study8=(PDFView) findViewById(R.id.pdfView7);
        study8.fromAsset("python.pdf").load();


    }
}
