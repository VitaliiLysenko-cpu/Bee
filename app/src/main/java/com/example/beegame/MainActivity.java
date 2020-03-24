package com.example.beegame;


import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;


public class MainActivity extends AppCompatActivity {

    ConstraintLayout constraintLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        constraintLayout = new ConstraintLayout(this);
        constraintLayout = findViewById(R.id.constraint_layout);

        for (int i = 1; i <= 5; i++) {
            ImageView imageViewWorkerBee = new ImageView(this);
            imageViewWorkerBee.setImageResource(R.drawable.worker_bee);
            imageViewWorkerBee.setId(imageViewWorkerBee. generateViewId ());
            constraintLayout.addView(imageViewWorkerBee);
        }

        ConstraintSet set = new ConstraintSet();
        changeConstraints(set);
    }

    private void changeConstraints(ConstraintSet set) {
        //set.connect();
        //set.connect();
    }
}
