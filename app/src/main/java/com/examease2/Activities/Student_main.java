package com.examease2.Activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.examease2.Fragments.course_home;
import com.examease2.R;


public class Student_main extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_interface);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.student_fragement_viewer, new course_home(this))
                    .commit();
        }


    }

}