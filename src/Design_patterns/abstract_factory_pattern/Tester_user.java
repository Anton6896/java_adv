package Design_patterns.abstract_factory_pattern;

/**
 * abstract factory user tester
 * creation of instances from here
 */

public class Tester_user {
    public static void main(String[] args) {
        EnemyShipBuilding makeUfo = new UFOEnemyShipBuilding();
        EnemyShip theGrunt = makeUfo.orderTheShip("ufo");
        System.out.println(theGrunt + "\n");

        EnemyShip theBoss = makeUfo.orderTheShip("ufo boss");
        System.out.println(theBoss);

    }
}
