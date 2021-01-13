package Design_patterns.abstract_factory_pattern;

public abstract class EnemyShipBuilder {
    // some abstract Enemy ship call

    protected abstract EnemyShip build_enemy_ship_util(String typeOfShip);

    public EnemyShip order_this_ship(String typeOfShip) {

        // ordering the new concrete ship obj
        EnemyShip shipObj = build_enemy_ship_util(typeOfShip); // -> get Abstract Ship

        // build an concrete type os sheep
        shipObj.makeShip();
        shipObj.displayEnamyShip();
        shipObj.followHeroShip();
        shipObj.enemyShipShuts();

        return shipObj;
    }

}
