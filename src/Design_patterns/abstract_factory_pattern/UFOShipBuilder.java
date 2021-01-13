package Design_patterns.abstract_factory_pattern;

public class UFOShipBuilder extends EnemyShipBuilding {
    /**
     * waiting for the order of enemy ship by type
     * and creating the new ship
     *
     * @param typeOfShip U, B
     * @return enemy ship object
     */
    @Override
    protected EnemyShip makeEnemyShip(String typeOfShip) {
        EnemyShip theEnemyShip = null;

        /*
        the ordering mechanism (from EnemyShipBuilding ) is calling for the appropriate obj creation
         */

        if (typeOfShip.toLowerCase().equals("ufo")) {
            // from abstract to specific UFO sheep
            EnemyShipFactory factory = new UFOEnemyShipFactory();
            theEnemyShip = new UFOEnemyShip(factory);
            theEnemyShip.setName("regular ship");

        } else if (typeOfShip.toLowerCase().equals("ufo boss")) {
            EnemyShipFactory factory = new UFOBossEnemyShipFactory();
            theEnemyShip = new UFOBossEnemyShip(factory);
            theEnemyShip.setName("Boss Ship");
        }


        return theEnemyShip;
    }
}
