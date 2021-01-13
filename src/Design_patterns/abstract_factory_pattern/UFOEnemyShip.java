package Design_patterns.abstract_factory_pattern;

/*
concrete enemy sheep  ( strategy pattern use )
 */
public class UFOEnemyShip extends EnemyShip {
    EnemyShipFactory shipFactory;

    public UFOEnemyShip(EnemyShipFactory shipFactory) {
        this.shipFactory = shipFactory;
    }

    @Override
    void makeShip() {
        System.out.println("making enemy (regular ship) ship - " + getName());
//        esWeapon = shipFactory.addsGun();
//        esEngine = shipFactory.addsEngine();

        setEsWeapon(new ESUFOGun());
        setEsEngine(new ESUFOEngine());
    }
}
