package com.example.beegame;


import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

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
        setImageViewAttributes(imageQueenBee);
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
            setImageViewAttributes(imageWorkerBee);
            linearWorkerBee.addView(imageWorkerBee);
        }
        for (int i = 1; i <= 7; i++) {
            ImageView imageDroneBee = new ImageView(this);
            imageDroneBee.setImageResource(R.drawable.drone_bee);
            setImageViewAttributes(imageDroneBee);
            linearDroneBee.addView(imageDroneBee);
        }
        
        Button swat = new Button(this);
        swat.setText("Swat");
        swat.setBackgroundColor(ContextCompat.getColor(this, R.color.colorButton));
        linearLayout.addView(swat);
    }
    
    private void setImageViewAttributes(ImageView imageView) {
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT,
                1);
        imageView.setLayoutParams(params);
        
        
    }
}
