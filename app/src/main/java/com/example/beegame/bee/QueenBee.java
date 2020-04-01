package com.example.beegame.bee;

import com.example.beegame.R;

public class QueenBee implements Bee {
    private int hit = 100;
    public QueenBee() {
    }
    
    public int hitPoints() {
        return hit -= 8;
    }
    @Override
    public int image() {
        return R.drawable.queen_bee;
    }
    
    
    @Override
    public String toString() {
        String string;
        if (hit > 1) {
             string = "QueenBee{" +
                    "Hit=" + hit +
                    '}';
        }else {
            string = null;
        }
        return string;
    }
    
}
