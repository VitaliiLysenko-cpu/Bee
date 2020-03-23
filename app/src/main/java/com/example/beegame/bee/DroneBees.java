package com.example.beegame.bee;

import com.example.beegame.bee.Bee;

 public class DroneBees extends Bee {
    private int hit = 50;

    public DroneBees() {
    }

    public int hitPoints() {
        return hit -= 12;
    }
}
