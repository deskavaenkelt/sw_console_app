package org.example.GameEngine;

import org.example.pods.PodRacer;
import org.example.utils.Helper;

public class Race {
    // podracers
    PodRacer[] podRacers = new PodRacer[2];

    // konstruktor för podracers


    public Race(PodRacer[] podRacers) {
        this.podRacers = podRacers;
    }

    public void start() {
        System.out.println("Start Pod Race");

        int round = 1;
        int maxRounds = 10;
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

        System.out.println("Game Over!");
    }
}
