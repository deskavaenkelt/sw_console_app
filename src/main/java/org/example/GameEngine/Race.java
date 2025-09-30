package org.example.GameEngine;

import org.example.utils.Helper;

public class Race {
    // podracers

    // konstruktor för podracers

    public void start() {
        System.out.println("Start Pod Race");

        int round = 1;
        int maxRounds = 100;
        Helper helper = new Helper();

        while(true) {
            System.out.println("Round " + round);

            // Hastighetsökning

            // Skada

            round++;
            if (round > maxRounds) {
                break;
            }
            helper.sleepForMilliSeconds(50);
        }
    }
}
