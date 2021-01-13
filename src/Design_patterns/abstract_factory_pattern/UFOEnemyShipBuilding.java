package Design_patterns.abstract_factory_pattern;

import java.util.Locale;

public class UFOEnemyShipBuilding extends EnemyShipBuilding {
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

        if (typeOfShip.toLowerCase().equals("ufo")) {
            EnemyShipFActory shipPartFactory = new UFOEnemyShipFactory();
            theEnemyShip = new UFOEnemyShip(shipPartFactory);
            theEnemyShip.setName("regular ship");

        } else if (typeOfShip.toLowerCase().equals("ufo boss")) {
            EnemyShipFActory shipPartFactory = new UFOBossEnemyShipFactory();
            theEnemyShip = new UFOEnemyShip(shipPartFactory);
            theEnemyShip.setName("Boss Ship");
        }


        return theEnemyShip;
    }
}
