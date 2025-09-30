package org.example;

import org.example.utils.Helper;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pod Racer");
        helperVerify();
    }

    private static void helperVerify(){
        Helper helper = new Helper();
        System.out.println(helper.randomInt());
        System.out.println("sleep");
        helper.sleepForMilliSeconds(1000);
        System.out.println("done sleeping");
    }
}
