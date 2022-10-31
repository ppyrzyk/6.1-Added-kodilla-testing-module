

package com.kodilla.rps;

import java.util.Random;

public class ComputerChoice implements PlayRPS {
     private Random rand;

    public ComputerChoice(Random rand) {
        this.rand = rand;
    }

    @Override
    public String play() {
        return chosen[this.rand.nextInt(2)];
    }
}

