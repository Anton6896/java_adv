package Design_patterns.Adapter;

import java.util.Random;

public class EnemyTank implements EnemyAttacker {

    Random random = new Random();


    @Override
    public void fire_weapon() {
        int power = random.nextInt(10) + 1;
        System.out.println("enemy tank fire with " + power + " damage ");
    }

    @Override
    public void drive_forward() {
        int speed = random.nextInt(10) + 1;
        System.out.println("enemy tank move for " + speed + " speed ");
    }

    @Override
    public void assign_driver(String name) {
        System.out.println("enemy tank driver name " + name);
    }
}
