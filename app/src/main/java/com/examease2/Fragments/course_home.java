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

public class course_home extends Fragment {
    Context context;
    List<Course> available_courses;
    public course_home(Context context) {
        this.context = context;
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.student_course_enrolled_fragment, container, false);
//        Available Courses Recycle Viewer Setting
        available_courses = new ArrayList<>();

        available_courses.add(new Course("He Died with...", "Categorie Book", "Description book", R.drawable.achievement_svgrepo_com));
        available_courses.add(new Course("He Died with...", "Categorie Book", "Description book", R.drawable.achievement_svgrepo_com));
        available_courses.add(new Course("He Died with...", "Categorie Book", "Description book", R.drawable.achievement_svgrepo_com));
        available_courses.add(new Course("He Died with...", "Categorie Book", "Description book", R.drawable.achievement_svgrepo_com));

        RecyclerView availablerecycler = view.findViewById(R.id.recycler_view_course_available);
        RecyclerViewAdapter availablecoursesAdapter = new RecyclerViewAdapter(context, available_courses);
        availablerecycler.setLayoutManager(new GridLayoutManager(context, 2));
        availablerecycler.setAdapter(availablecoursesAdapter);

        // Inflate the layout for this fragment
        return view;
    }
}