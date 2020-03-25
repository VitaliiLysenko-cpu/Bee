package com.example.beegame;


import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.widget.LinearLayoutCompat;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    
    LinearLayout linearLayout;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        linearLayout = findViewById(R.id.linear_layout);
        
        addImageView();
        
        
    }
    
    private void addImageView() {
        
        ImageView imageQueenBee = new ImageView(this);
        imageQueenBee.setImageResource(R.drawable.queen_bee);
        linearLayout.addView(imageQueenBee);
        
        LinearLayout linearWorkerBee = new LinearLayout(this);
        LinearLayout linearDroneBee = new LinearLayout(this);
        
        linearWorkerBee.setOrientation(LinearLayout.HORIZONTAL);
        linearLayout.addView(linearWorkerBee);
        
        linearDroneBee.setOrientation(LinearLayout.HORIZONTAL);
        linearLayout.addView(linearDroneBee);
        
        for (int i = 1; i <= 5; i++) {
            ImageView imageWorkerBee = new ImageView(this);
            imageWorkerBee.setImageResource(R.drawable.worker_bee);
            linearWorkerBee.addView(imageWorkerBee);
        }
        for (int i = 1; i <= 7; i++) {
            ImageView imageDroneBee = new ImageView(this);
            imageDroneBee.setImageResource(R.drawable.drone_bee);
            linearDroneBee.addView(imageDroneBee);
        }
    
    }
    
    
}
