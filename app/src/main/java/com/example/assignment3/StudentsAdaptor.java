package com.example.assignment3;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

class StudentsAdaptor extends RecyclerView.Adapter<StudentsViewHolder>{
    private List<Student> students;

    public StudentsAdaptor(List<Student> students) {
        this.students = students;
    }

    @NonNull
    @Override
    public StudentsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View studentItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_item, parent, false);
        return new StudentsViewHolder(studentItem);
    }

    @Override
    public void onBindViewHolder(StudentsViewHolder holder, int position) {
        Student currentStudent = students.get(position);
        holder.getTextViewFirstName().setText(currentStudent.getFirstName());
        holder.getTextViewLastName().setText(currentStudent.getLastName());
    }

    @Override
    public int getItemCount() {
        return students.size();
    }
}
