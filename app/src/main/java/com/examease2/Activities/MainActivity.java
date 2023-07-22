package com.examease2.Activities;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.examease2.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
//    LoginButton fb_login_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro_sign_up_and_login);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow();
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
//        fb_login_btn = findViewById(R.id.login_button);

        ImageSlider slider = findViewById(R.id.ImageSlider);
        List<SlideModel> slider_data = new ArrayList<>();
        slider_data.add(new SlideModel(R.drawable.img_1_intro, ScaleTypes.CENTER_INSIDE));
        slider_data.add(new SlideModel(R.drawable.img_2_intro, ScaleTypes.CENTER_INSIDE));
        slider_data.add(new SlideModel(R.drawable.img_3_intro, ScaleTypes.CENTER_INSIDE));
        slider.setImageList(slider_data, ScaleTypes.FIT);


//        Button register
//        Button login_btn = findViewById(R.id.login_btn);
        Button register_btn = findViewById(R.id.register_button);

        register_btn.setOnClickListener(l->{
            startActivity(new Intent(this, Student_main.class));
        });
//        fb_login_btn.setOnClickListener(l->{
//            startActivity(new Intent(this, FacebookLoginActivity.class));
//            finish();
//        });
//        login_btn.setOnClickListener(l->{
//
//        });

    }

}