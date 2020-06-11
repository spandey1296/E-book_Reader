package com.cccexamstudy.pdf_book;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Study3Activity extends AppCompatActivity {

    PDFView study3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study3);


        study3=(PDFView) findViewById(R.id.pdfView3);
        study3.fromAsset("python.pdf").load();
    }
}
