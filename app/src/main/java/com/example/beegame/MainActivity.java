package com.example.beegame;


import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;


public class MainActivity extends AppCompatActivity {

    ConstraintLayout constraintLayout;
    ConstraintSet set = new ConstraintSet();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        constraintLayout = new ConstraintLayout(this);
        constraintLayout = findViewById(R.id.constraint_layout);

        for (int i = 1; i <= 5; i++) {
            ImageView imageViewWorkerBee = new ImageView(this);
            imageViewWorkerBee.setId(imageViewWorkerBee. generateViewId ());
            constraintLayout.addView(imageViewWorkerBee);
            imageViewWorkerBee.setImageResource(R.drawable.worker_bee);
            set.clone(constraintLayout);
            set.connect(imageViewWorkerBee.getId(),ConstraintSet.LEFT, constraintLayout.NO_ID,
                    ConstraintSet.END);


        }



    }

  // private void changeConstraints(ConstraintSet set) {
  //     set.connect(R.id.constraint_layout, ConstraintSet.LEFT,R.id.);
  //     //set.connect(R.id.constraint_layout, ConstraintSet.BOTTOM, R.id.parent, ConstraintSet.TOP);
  // }
}
