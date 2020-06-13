package com.cccexamstudy.pdf_book;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class StudyViewActivity extends AppCompatActivity {

    private static final String EXTENSION = ".pdf";

    private PDFView pdfView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_view);

        pdfView = findViewById(R.id.pdfView);
        String fileNameWithExtension = getIntent().getStringExtra("pdfName") + EXTENSION;
        pdfView.fromAsset(fileNameWithExtension).load();
    }
}
