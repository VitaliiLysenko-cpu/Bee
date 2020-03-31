package com.example.beegame.bee;

import com.example.beegame.R;

public class WorkerBee implements Bee {
    private int hit = 75;
    private int copyHit = hit;
    public WorkerBee() {
    }
    
    public int hitPoints() {
        return hit -= 10;
    }
    
    @Override
    public int image() {
        return R.drawable.worker_bee;
    }
    
    @Override
    public void recoveryHit() {
        hit = copyHit;
    }
    
    @Override
    public String toString() {
        return "WorkerBee{" +
                "Hit=" + hit +
                '}';
    }
}
