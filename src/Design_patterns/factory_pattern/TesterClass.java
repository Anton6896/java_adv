package Design_patterns.factory_pattern;

import java.util.Scanner;

public class TesterClass {

    public static void doSome(EnemyShip ship) {
//        using object that war return from factory
        ship.displayEnemyShip();
        ship.followingAnHero();
        ship.enemyShipShutting();
    }

    public static void main(String[] args) {
        EnemyShipFactory factory = new EnemyShipFactory();
        EnemyShip enemyShip; // this way good for testing

        Scanner scan = new Scanner(System.in);
        System.out.println("what type of ship : U / R / B");

        if (scan.hasNextLine()) {
            String typeOf = scan.nextLine(); // get user needs
            enemyShip = factory.makeEnemyShip(typeOf);  // return the appropriate response

            if (enemyShip != null) {
                doSome(enemyShip);
            } else {
                System.out.printf("ship : U / R / B");
            }
        }
    }
}
