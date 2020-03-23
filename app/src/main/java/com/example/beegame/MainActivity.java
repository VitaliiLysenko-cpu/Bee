package com.example.beegame;


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;


public class MainActivity extends AppCompatActivity {

    ConstraintLayout constraintLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        constraintLayout = new ConstraintLayout(this);
        ConstraintSet set = new ConstraintSet();
        changeConstraints(set);
       }
    private void changeConstraints(ConstraintSet set) {
        set.connect(R.id.constraint_layout, ConstraintSet.LEFT, R.id.text_view1, ConstraintSet.LEFT);
        set.connect(R.id.constraint_layout, ConstraintSet.BOTTOM,R.id.parent,ConstraintSet.TOP);
    }
}
