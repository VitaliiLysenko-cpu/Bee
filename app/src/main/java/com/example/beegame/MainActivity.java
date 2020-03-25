package com.example.beegame;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import android.widget.LinearLayout;


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
        imageQueenBee.setImageResource(R.drawable.worker_bee);
        linearLayout.addView(imageQueenBee);
        
        LinearLayout linearWorkerBee = new LinearLayout(this);
        LinearLayout linearDroneBee = new LinearLayout(this);
        
        linearWorkerBee.setOrientation(LinearLayout.HORIZONTAL);
        linearDroneBee.setOrientation(LinearLayout.HORIZONTAL);
        
        linearLayout.addView(linearWorkerBee);
        linearLayout.addView(linearDroneBee);
        
        for (int i = 1; i <= 5; i++) {
            ImageView imageWorkerBee = new ImageView(this);
            imageWorkerBee.setImageResource(R.drawable.worker_bee);
            linearWorkerBee.addView(imageWorkerBee);
        }
        for (int i = 1; i <= 7; i++) {
            ImageView imageDroneBee = new ImageView(this);
            imageDroneBee.setImageResource(R.drawable.drone_bee);
            linearWorkerBee.addView(imageDroneBee);
        }
        addLineSeperator();
    }
    
    private void addLineSeperator() {
        LinearLayout lineLayout = new LinearLayout(this);
        lineLayout.setBackgroundColor(Color.GRAY);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                2);
        params.setMargins(0, convertDpToPixel(10), 0, convertDpToPixel(10));
        lineLayout.setLayoutParams(params);
        linearLayout.addView(lineLayout);
    }
    
    private int convertDpToPixel(float dp) {
        DisplayMetrics metrics = Resources.getSystem().getDisplayMetrics();
        float px = dp * (metrics.densityDpi / 160f);
        return Math.round(px);
    }
}
