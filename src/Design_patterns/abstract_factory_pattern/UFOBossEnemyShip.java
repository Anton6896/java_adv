package Design_patterns.abstract_factory_pattern;

public class UFOBossEnemyShip extends EnemyShip {
    EnemyShipFActory shipFActory;

    public UFOBossEnemyShip(EnemyShipFActory shipFActory) {
        this.shipFActory = shipFActory;
    }

    @Override
    void makeShip() {  // EnemyShip
        System.out.println("making ship - " + getName());
        esWeapon = shipFActory.addsGun();
        esEngine = shipFActory.addsEngine();
    }
}
