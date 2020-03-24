package com.example.beegame;


import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import static androidx.constraintlayout.widget.ConstraintSet.BOTTOM;
import static androidx.constraintlayout.widget.ConstraintSet.END;
import static androidx.constraintlayout.widget.ConstraintSet.LEFT;
import static androidx.constraintlayout.widget.ConstraintSet.PARENT_ID;
import static androidx.constraintlayout.widget.ConstraintSet.TOP;


public class MainActivity extends AppCompatActivity {
    
    ConstraintLayout constraintLayout;
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        constraintLayout = new ConstraintLayout(this);
        constraintLayout = findViewById(R.id.constraint_layout);
        
        ConstraintSet set = new ConstraintSet();
        
        ImageView imageViewQueenBee = new ImageView(this);
        int queenBeeIdView = View.generateViewId();
        imageViewQueenBee.setId(queenBeeIdView);
        constraintLayout.addView(imageViewQueenBee);
        imageViewQueenBee.setImageResource(R.drawable.queen_bee);
        set.connect(PARENT_ID, LEFT, queenBeeIdView, LEFT, 8);
        set.connect(PARENT_ID, TOP, queenBeeIdView, TOP, 8);
        
        int prewIdView = queenBeeIdView;
        for (int i = 1; i <= 5; i++) {
            ImageView imageViewWorkerBee = new ImageView(this);
            int idThisView = View.generateViewId();
            imageViewWorkerBee.setId(idThisView);
            constraintLayout.addView(imageViewWorkerBee);
            imageViewWorkerBee.setImageResource(R.drawable.worker_bee);
            set.connect(prewIdView, LEFT, idThisView, LEFT);
            set.connect(prewIdView, BOTTOM, idThisView, TOP);
            
            prewIdView = idThisView;
            set.applyTo(constraintLayout);
            
            
        }
    }
}
