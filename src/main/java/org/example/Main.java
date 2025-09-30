package org.example;

import org.example.GameEngine.Race;
import org.example.pods.PodRacer;
import org.example.utils.Helper;

public class Main {
    public static void main(String[] args) {
//        helperVerify();
//        podRacerVerify();
        startRace();
    }

    private static void startRace() {
        PodRacer[] podRacers = new PodRacer[2];
        podRacers[0] = new PodRacer("Anakin");
        podRacers[1] = new PodRacer("Sebulba");

        System.out.println("Pod Racer");
        Race race = new Race(podRacers);
        race.start();
    }

    private static void podRacerVerify() {
        PodRacer p1 = new PodRacer("Nisse");
        System.out.println(p1.isFunctional());
        p1.status();
        p1.takeDame(100);
        p1.speedBoost(100);
    }

    private static void helperVerify() {
        Helper helper = new Helper();
        System.out.println(helper.randomInt());
        System.out.println("sleep");
        helper.sleepForMilliSeconds(1000);
        System.out.println("done sleeping");
    }
}
