package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class StudentsActivity extends AppCompatActivity {

    private List<Student> students;
    private RecyclerView recyclerViewStudents;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students);
        getStudents();
        recyclerViewStudents = findViewById(R.id.recyclerViewStudents);
        setLayoutManager(recyclerViewStudents);
        setAdaptor(recyclerViewStudents);

    }

    private void getStudents() {
        students = new ArrayList<>();
        Student student = null;
        for (int i = 0; i < 30; i++) {
            student = new Student();
            student.setFirstName("FirstName " + (i + 1));
            student.setLastName("LastName " + (i + 1));
            students.add(student);
        }
    }

    private void setLayoutManager(RecyclerView recyclerViewStudents) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerViewStudents.setLayoutManager(linearLayoutManager);
    }

    private void setAdaptor(RecyclerView recyclerViewStudents) {
        StudentsAdaptor studentsAdaptor = new StudentsAdaptor(students);
        recyclerViewStudents.setAdapter(studentsAdaptor);
    }
}
