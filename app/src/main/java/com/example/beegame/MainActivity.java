package com.example.beegame;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.example.beegame.bee.Bee;
import com.example.beegame.bee.DroneBee;
import com.example.beegame.bee.QueenBee;
import com.example.beegame.bee.WorkerBee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    
    private final int swatId = 100;
    private final int restartId = 101;
    private final int exitId = 102;
    LinearLayout linearLayout;
    Button swat;
    Button restart;
    Button exit;
    private int quantityWorkerBee = 5;
    private int quantityDroneBee = 7;
    private Map<Integer, Integer> beeMap = new HashMap<>();
    private QueenBee queenBee = new QueenBee();
    private WorkerBee workerBee = new WorkerBee();
    private DroneBee droneBee = new DroneBee();
    private ArrayList<Bee> bees = getBees();
    private ImageView imageBee;
    private int visible = View.VISIBLE;
    private int invisible = View.INVISIBLE;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout = findViewById(R.id.linear_layout);
        createView();
    }
    
    private void createView() {
        addImageView();
        addButton();
        swat.setOnClickListener(this);
        restart.setOnClickListener(this);
        exit.setOnClickListener(this);
    }
    
    private void addImageView() {
        
        for (int i = 0; i < bees.size(); i++) {
            int id = View.generateViewId();
            imageBee = new ImageView(this);
            imageBee.setImageResource(bees.get(i).image());
            imageBee.setId(id);
            beeMap.put(i, id);
            setImageViewAttributes(imageBee);
            linearLayout.addView(imageBee);
        }
    }
    
    private void addButton() {
        swat = new Button(this);
        restart = new Button(this);
        exit = new Button(this);
        swat.setId(swatId);
        restart.setId(restartId);
        exit.setId(exitId);
        swat.setText("Swat");
        restart.setText("Rstart");
        exit.setText("Exit");
        swat.setBackgroundColor(ContextCompat.getColor(this, R.color.colorButtonSwat));
        restart.setBackgroundColor(ContextCompat.getColor(this, R.color.colorButtonRestart));
        exit.setBackgroundColor(ContextCompat.getColor(this, R.color.colorButtonExit));
        swat.setVisibility(visible);
        restart.setVisibility(invisible);
        exit.setVisibility(invisible);
        linearLayout.addView(swat);
        linearLayout.addView(restart);
        linearLayout.addView(exit);
    }
    
    private void setImageViewAttributes(ImageView imageView) {
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT,
                1);
        imageView.setLayoutParams(params);
    }
    
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case swatId:
                whoHit();
                break;
            case restartId:
                linearLayout.removeAllViews();
                queenBee.recoveryHit();
                workerBee.recoveryHit();
                droneBee.recoveryHit();
                createView();
                break;
            case exitId:
                finish();
                break;
        }
    }
    
    private int randomSwat() {
        return (int) (0 + Math.random() * (bees.size() - 1));
    }
    
    private void whoHit() {
        int index = randomSwat();
        Bee randBee = bees.get(index);
        
        if (randBee.hitPoints() < 1) {
            View viewById = linearLayout.findViewById(beeMap.get(index));
            linearLayout.removeView(viewById);
        }
        Toast.makeText(this, randBee.toString(), Toast.LENGTH_LONG).show();
        if (queenBee.toString() == null) {
            swat.setVisibility(invisible);
            restart.setVisibility(visible);
            exit.setVisibility(visible);
        }
    }
    
    private ArrayList<Bee> getBees() {
        ArrayList<Bee> allBees = new ArrayList<>();
        
        allBees.add(queenBee);
        for (int i = 0; i < quantityWorkerBee; i++) {
            allBees.add(new WorkerBee());
        }
        for (int i = 0; i < quantityDroneBee; i++) {
            allBees.add(new DroneBee());
        }
        return allBees;
    }
}
