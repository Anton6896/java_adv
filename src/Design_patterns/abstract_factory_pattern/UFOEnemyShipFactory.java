package Design_patterns.abstract_factory_pattern;

public class UFOEnemyShipFactory implements EnemyShipFActory {

    @Override
    public ESWeapon addsGun() {
        return new ESUFOGun();
    }

    @Override
    public ESEngine addsEngine() {
        return new ESUFOEngine();
    }
}
