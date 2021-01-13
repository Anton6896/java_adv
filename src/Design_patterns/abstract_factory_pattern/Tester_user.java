package Design_patterns.abstract_factory_pattern;

/**
 * abstract factory user tester
 * creation of instances from here
 */

public class Tester_user {
    public static void main(String[] args) {
        EnemyShipBuilding manager = new UFOShipBuilder();

        // i need some EnemySheep -> abstract sheep
        // manager.order   -> get specific sheep
        EnemyShip theGrunt = manager.orderTheShip("ufo");
        EnemyShip theBoss = manager.orderTheShip("ufo boss");

        System.out.println("\n"+theGrunt);
        System.out.println(theBoss);



    }
}
