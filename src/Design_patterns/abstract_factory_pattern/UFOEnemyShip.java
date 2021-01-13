package Design_patterns.abstract_factory_pattern;

public class UFOEnemyShip extends EnemyShip {
    EnemyShipFActory shipFactory;

    public UFOEnemyShip(EnemyShipFActory shipFactory) {
        this.shipFactory = shipFactory;
    }

    @Override
    void makeShip() {
        System.out.println("making enemy ship" + getName());
        esWeapon = shipFactory.addsGun();
        esEngine = shipFactory.addsEngine();
    }
}
