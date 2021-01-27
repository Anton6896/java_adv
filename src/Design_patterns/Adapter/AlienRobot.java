package Design_patterns.Adapter;

import java.util.Random;

public class AlienRobot {
    Random random = new Random();

    void smash_with_hands() {
        int power = random.nextInt(10) + 1;
        System.out.println("Robot with hands with power " + power);
    }

    void walk() {
        int speed = random.nextInt(10) + 1;
        System.out.println("Robot walking with speed " + speed);
    }

    void set_name(String name) {
        System.out.println("Robot name is " + name);
    }
}
