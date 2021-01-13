package Design_patterns.abstract_factory_pattern;

public abstract class EnemyShipBuilding {
    // act as ordering mechanism for creating enemy_ships ( name, weapon, engine)

    protected abstract EnemyShip makeEnemyShip(String typeOfShip);

    public EnemyShip orderTheShip(String typeOfShip) {
        EnemyShip theEnemyShip = makeEnemyShip(typeOfShip);

        theEnemyShip.makeShip();
        theEnemyShip.displayEnamyShip();
        theEnemyShip.followHeroShip();
        theEnemyShip.enemyShipShuts();

        return theEnemyShip;
    }

}
