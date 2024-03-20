package com.example.animation;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ImageView img1, img2, img3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);

        img1.setImageResource(R.drawable.darkfox);
        img2.setImageResource(R.drawable.lightfox);
        img3.setImageResource(R.drawable.greyfox);

//        RotateAnimation rotate1 = new RotateAnimation(0, 90,
//                Animation.RELATIVE_TO_SELF, 0.5f,
//                Animation.RELATIVE_TO_SELF, 0.5f);
//
//        rotate1.setDuration(4000);
//        rotate1.setInterpolator(new LinearInterpolator());
//        img1.startAnimation(rotate1);
//
//        RotateAnimation rotate2 = new RotateAnimation(0, 70,
//                Animation.RELATIVE_TO_SELF, 0.7f,
//                Animation.RELATIVE_TO_SELF, 0.5f);
//
//        rotate2.setDuration(5000);
//        rotate2.setInterpolator(new LinearInterpolator());
//        img2.startAnimation(rotate2);
//
//        RotateAnimation rotate3 = new RotateAnimation(0, 112,
//                Animation.RELATIVE_TO_SELF, 0.7f,
//                Animation.RELATIVE_TO_SELF, 0.5f);
//
//        rotate3.setDuration(6000);
//        rotate3.setInterpolator(new LinearInterpolator());
//        img3.startAnimation(rotate3);

        Rotate.startRotationAnimation(img1, 0, 90, 4000);
        Rotate.startRotationAnimation(img2, 0, 70, 5000);
        Rotate.startRotationAnimation(img3, 0, 112, 6000);


    }


}