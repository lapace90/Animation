package com.example.animation;

import android.os.Bundle;
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


        Rotate.startRotationAnimation(img1, 0, 90, 4000);
        Rotate.startRotationAnimation(img2, 0, 70, 5000);
        Rotate.startRotationAnimation(img3, 0, 112, 6000);


    }


}