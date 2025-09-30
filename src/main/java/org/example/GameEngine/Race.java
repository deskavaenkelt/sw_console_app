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
        int maxRounds = 100;
        Helper helper = new Helper();

        while(podRacers[0].isFunctional()  && podRacers[1].isFunctional()) {
            System.out.println("Round " + round);

            // Hastighetsökning
//            podRacers[0].speedBoost(helper.randomInt());
//            podRacers[1].speedBoost(helper.randomInt());
            for (int i = 0; i < podRacers.length; i++) {
                podRacers[i].speedBoost(helper.randomInt());
            }

            // Skada
//            podRacers[0].takeDame(helper.randomInt());
//            podRacers[1].takeDame(helper.randomInt());
            for (int i = 0; i < podRacers.length; i++)
                podRacers[i].takeDame(helper.randomInt());


            for (int i = 0; i < podRacers.length; i++)
                podRacers[i].status();

//            podRacers[1].takeDame(100);  // är med som debug
            round++;
            if (round > maxRounds) {
                break;
            }
            helper.sleepForMilliSeconds(50);
        }

        // Kontroller vem som vann
        if (!podRacers[0].isFunctional() && !podRacers[1].isFunctional())  {
            System.out.println("Both Pod racers hav crashed, nobody win!");
        } else if (!podRacers[0].isFunctional()) {
            System.out.println(podRacers[0].getName() + " have crashed! " + podRacers[1].getName() + " win the race!");
        } else if (!podRacers[1].isFunctional()) {
            System.out.println(podRacers[1].getName() + " have crashed! " + podRacers[0].getName() + " win the race!");
        } else {
            System.out.println("Something went wrong!");
        }


        System.out.println("Game Over!");
    }
}
