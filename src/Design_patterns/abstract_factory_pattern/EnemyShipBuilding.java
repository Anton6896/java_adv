package Design_patterns.abstract_factory_pattern;

public abstract class EnemyShipBuilding {
    // some abstract Enemy ship call

    protected abstract EnemyShip makeEnemyShip(String typeOfShip);

    public EnemyShip orderTheShip(String typeOfShip) {

        // ordering the new concrete ship obj
        EnemyShip shipObj = makeEnemyShip(typeOfShip); // -> UFOSheepBuilder()

        shipObj.makeShip();
        shipObj.displayEnamyShip();
        shipObj.followHeroShip();
        shipObj.enemyShipShuts();

        return shipObj;
    }

}
