package com.example.beegame.bee;


import com.example.beegame.R;

public class DroneBee implements Bee {
    private int hit = 50;
    private int copyHit = hit;
    public DroneBee() {
    }
    
    public int hitPoints() {
        return hit -= 12;
    }
  
    
    @Override
    public int image() {
        return R.drawable.drone_bee;
    }
    
    @Override
    public void recoveryHit() {
        hit = copyHit;
    }
    
    @Override
    public String toString() {
        return "DroneBee{" +
                "Hit=" + hit +
                '}';
    }
}
