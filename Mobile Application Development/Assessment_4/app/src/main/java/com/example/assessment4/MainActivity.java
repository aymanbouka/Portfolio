package com.example.assessment4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.assessment4.Models.Student;

public class MainActivity extends AppCompatActivity implements StudentsFragment.studentsListner {






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.rootView, new StudentsFragment())
                .commit();

    }


    @Override
    public void sendStudents(Student student) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.rootView, StudentHistoryFragment.newInstance(student))
                .addToBackStack(null)
                .commit();
    }
}//end class MainActivity