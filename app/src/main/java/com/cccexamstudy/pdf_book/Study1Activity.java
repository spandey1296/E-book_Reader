package com.cccexamstudy.pdf_book;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Study1Activity extends AppCompatActivity {

    PDFView study1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study1);

        study1=(PDFView) findViewById(R.id.pdfView1);
        study1.fromAsset("part1.pdf").load();

    }
}
