package com.cccexamstudy.pdf_book;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.cccexamstudy.pdf_book.model.StudyFile;
import com.cccexamstudy.pdf_book.util.StudyListAdapter;
import com.cccexamstudy.pdf_book.util.StudyProperties;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView studyListRecyclerView;

    private StudyProperties properties;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studyListRecyclerView = findViewById(R.id.studyListRecyclerView);
        studyListRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // load all available study properties
        properties = new StudyProperties(this);
        List<StudyFile> studyFiles = new ArrayList<>();
        for (String key : properties.getPropertyNames())
            studyFiles.add(new StudyFile(key, properties.getProperty(key)));

        // create adapter with study files
        StudyListAdapter adapter = new StudyListAdapter(MainActivity.this, studyFiles);
        studyListRecyclerView.setAdapter(adapter);

    }
}
