package Design_patterns.abstract_factory_pattern;


/*
 concrete Boss sheep
 */
public class UFOBossEnemyShip extends EnemyShip {
    EnemyShipFactory shipFactory;

    public UFOBossEnemyShip(EnemyShipFactory shipFActory) {
        this.shipFactory = shipFActory;
    }

    @Override
    void makeShip() {  // EnemyShip
        System.out.println("making (Boss bi one) ship - " + getName());
        esWeapon = shipFactory.addsGun();
        esEngine = shipFactory.addsEngine();
    }
}
