package Design_patterns.abstract_factory_pattern;

/**
 * abstract factory user tester
 * creation of instances from here
 */

public class Tester_user {
    public static void main(String[] args) {

        // UFO is an type of enemy for building
        EnemyShipBuilder factory = new UFOShipBuilder();

        // i need some EnemySheep -> abstract sheep
        // manager.order   -> get specific sheep
        EnemyShip theGrunt = factory.order_this_ship("ufo");
        EnemyShip theBoss = factory.order_this_ship("ufo boss");

        System.out.println("\n"+theGrunt);
        System.out.println(theBoss);

    }
}
