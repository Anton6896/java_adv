package Design_patterns.factory_pattern;

import java.util.Scanner;

/**
 * hide all implementation from the user
 * user creating factory :
 * EnemyShipFactory -> new factory.makeEnemyShip(typeOf);
 *
 * and dynamic create the object that depend on -> user needs <-
 */
public class TesterClass {

    public static void doSome(EnemyShip ship) {
//        using object that war return from factory
        if (ship != null) {
            ship.displayEnemyShip();
            ship.followingAnHero();
            ship.enemyShipShutting();
        } else {
            System.out.printf("ship : U / R / B");
        }
    }

    public static void main(String[] args) {
        EnemyShipFactory factory = new EnemyShipFactory();
        EnemyShip enemyShip; // this way good for testing

        Scanner scan = new Scanner(System.in);
        System.out.println("what type of ship : U / R / B");

        if (scan.hasNextLine()) {
            String typeOf = scan.nextLine(); // get user needs
            enemyShip = factory.makeEnemyShip(typeOf);  // return the appropriate response
            doSome(enemyShip);
        }
    }
}
