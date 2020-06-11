package com.cccexamstudy.pdf_book;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Study5Activity extends AppCompatActivity {


    PDFView study5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study5);


        study5=(PDFView) findViewById(R.id.pdfView5);
        study5.fromAsset("python.pdf").load();


    }
}
