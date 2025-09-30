package org.example.pods;

abstract class Racer {
    String name;
    int speed;
    int health;

    public Racer(String name) {
        this.name = name;
        this.speed = 0;
        this.health = 100;
    }

    public String getName() {
        return name;
    }

    public boolean isFunctional() {
        return health > 0;
    }

    public void status() {
        System.out.println(name + ", speed:" + speed + ", health: " + health);
    }

    abstract void takeDame(int damage);
    abstract void speedBoost(int amount);
}
