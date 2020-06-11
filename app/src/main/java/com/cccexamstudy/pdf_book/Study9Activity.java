package com.cccexamstudy.pdf_book;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class Study9Activity extends AppCompatActivity {

    PDFView study9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acttivity_study9);

        study9=(PDFView) findViewById(R.id.pdfView9);
        study9.fromAsset("python.pdf").load();




    }
}
