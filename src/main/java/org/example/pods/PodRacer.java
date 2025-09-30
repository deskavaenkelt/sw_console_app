package org.example.pods;

import org.example.utils.Helper;

public class PodRacer extends Racer {
    Helper helper = new Helper();

    public PodRacer(String name) {
        super(name);
    }

    @Override
    public void takeDame(int damage) {
        System.out.println(name + " took: " + damage + " damage!");
        health -= damage;
        if (isFunctional()) {
            System.out.println(name + " took damage! The health is now: " + health + "/100.");
        } else {
            health = 0;
        }
        helper.sleepForMilliSeconds(500);
    }

    @Override
    public void speedBoost(int amount) {
        if (isFunctional()) {
            speed += amount;
            System.out.println(name + " uses speed boost and increases their speed to " + speed + "km/h");
        } else {
            System.out.println(name + " is brooken and can't get any speed boost");
        }
        helper.sleepForMilliSeconds(500);
    }
}
