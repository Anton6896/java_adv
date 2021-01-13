package Design_patterns.abstract_factory_pattern;

public class UFOShipBuilder extends EnemyShipBuilder {
    /**
     * waiting for the order of enemy ship by type
     * and creating the new ship
     *
     * @param typeOfShip U, B
     * @return enemy ship object
     */
    @Override
    protected EnemyShip build_enemy_ship_util(String typeOfShip) {
        EnemyShip theEnemyShip = null;

        // check what kind of object need to be build from UFO objects
        // build an object from needs of user


        if (typeOfShip.toLowerCase().equals("ufo")) {
            // from abstract to specific UFO sheep
            EnemyShipFactory factory = new UFOEnemyShipFactory();
            theEnemyShip = new UFOEnemyShip(factory);  // <- get and ufo sheep
            theEnemyShip.setName("regular ship");

        } else if (typeOfShip.toLowerCase().equals("ufo boss")) {
            EnemyShipFactory factory = new UFOBossEnemyShipFactory();
            theEnemyShip = new UFOBossEnemyShip(factory);
            theEnemyShip.setName("Boss Ship");
        }


        return theEnemyShip;
    }
}
