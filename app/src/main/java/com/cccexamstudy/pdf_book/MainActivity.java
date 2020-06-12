package com.cccexamstudy.pdf_book;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.cccexamstudy.pdf_book.model.StudyFile;
import com.cccexamstudy.pdf_book.util.StudyListAdapter;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView studyListRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studyListRecyclerView = findViewById(R.id.studyListRecyclerView);
        studyListRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        List<StudyFile> studyFiles = Arrays.asList(
                new StudyFile("111", "ONE"),
                new StudyFile("222", "TWO"),
                new StudyFile("333", "THREE")
                );
        StudyListAdapter adapter = new StudyListAdapter(MainActivity.this, studyFiles);
        studyListRecyclerView.setAdapter(adapter);
    }
}
