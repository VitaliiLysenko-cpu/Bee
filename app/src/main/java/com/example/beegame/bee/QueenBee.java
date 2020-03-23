package com.example.beegame.bee;

import com.example.beegame.bee.Bee;

 public class QueenBee<verride> extends Bee {
    private int hit = 100;
    public QueenBee() {
    }

    public int hitPoints(){
        return hit -= 8;
    }
}
