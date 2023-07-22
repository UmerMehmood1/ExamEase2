package com.examease2.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.examease2.Adapter.RecyclerViewAdapter;
import com.examease2.Models.Course;
import com.examease2.R;

import java.util.ArrayList;
import java.util.List;

public class course_enrolled extends Fragment {
    List<Course> enrolled_courses;
    Context context;

    public course_enrolled(Context context) {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.student_course_enrolled_fragment, container, false);
        // Inflate the layout for this fragment
        //        Enrolled Courses Recycle Viewer Setting
        enrolled_courses = new ArrayList<>();

        enrolled_courses.add(new Course("He Died with...", "Categorie Book", "Description book", R.drawable.achievement_svgrepo_com));
        enrolled_courses.add(new Course("He Died with...", "Categorie Book", "Description book", R.drawable.achievement_svgrepo_com));
        enrolled_courses.add(new Course("He Died with...", "Categorie Book", "Description book", R.drawable.achievement_svgrepo_com));
        enrolled_courses.add(new Course("He Died with...", "Categorie Book", "Description book", R.drawable.achievement_svgrepo_com));
        enrolled_courses.add(new Course("He Died with...", "Categorie Book", "Description book", R.drawable.achievement_svgrepo_com));

        RecyclerView enrolledrecycler = view.findViewById(R.id.recycler_view_course_available);
        RecyclerViewAdapter enrolledcoursesAdapter = new RecyclerViewAdapter(context, enrolled_courses);
        enrolledrecycler.setLayoutManager(new GridLayoutManager(context, 2));
        enrolledrecycler.setAdapter(enrolledcoursesAdapter);

        return view;
    }
}