package com.example.a100372147.drinkngame;

import android.content.Intent;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Random;

public class SpinTheBottle extends AppCompatActivity {

    ImageButton ib_bottle;
    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spin_the_bottle);

        ib_bottle = (ImageButton) findViewById(R.id.ib_bottle);

        ib_bottle.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View view) {
                int angle = random.nextInt();
                RotateAnimation rotate = new RotateAnimation(0, angle,
                        RotateAnimation.RELATIVE_TO_SELF, 0.1f, RotateAnimation.RELATIVE_TO_SELF, 0.1f);
                rotate.setInterpolator(new AccelerateDecelerateInterpolator());

                ib_bottle.startAnimation(rotate);
                ib_bottle.setRotation(angle);
            }
        });
    }
}
