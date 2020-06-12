package com.cccexamstudy.pdf_book.util;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cccexamstudy.pdf_book.R;
import com.cccexamstudy.pdf_book.StudyViewActivity;
import com.cccexamstudy.pdf_book.model.StudyFile;

import java.util.List;

public class StudyListAdapter extends RecyclerView.Adapter<StudyListAdapter.StudyListViewHolder> {

    private Context context;
    private List<StudyFile> studyFiles;

    public StudyListAdapter(Context context, List<StudyFile> studyFiles) {
        this.context = context;
        this.studyFiles = studyFiles;
    }

    @NonNull
    @Override
    public StudyListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Inflate custom layout for list row
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.study_list_row, parent, false);
        return new StudyListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudyListViewHolder holder, int position) {

        final StudyFile studyFile = studyFiles.get(position);
        holder.titleTextButton.setText(studyFile.getDisplayName());
        holder.titleTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // show pdf view activity
                Intent intent = new Intent(context, StudyViewActivity.class);
                intent.putExtra("pdfName", studyFile.getFileName());
                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return studyFiles.size();
    }

    public static class StudyListViewHolder extends RecyclerView.ViewHolder {

        Button titleTextButton;

        public StudyListViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextButton = itemView.findViewById(R.id.titleTextButton);
        }
    }
}
