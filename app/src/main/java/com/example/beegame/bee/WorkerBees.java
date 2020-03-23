package com.example.beegame.bee;

import com.example.beegame.bee.Bee;

 public class WorkerBees extends Bee {
    private int  hit = 75;

    public WorkerBees() {
    }

    public int hitPoints (){
        return hit -= 10;
    }
}
