package Design_patterns.abstract_factory_pattern;

public class UFOBossEnemyShipFactory implements EnemyShipFactory {
    @Override
    public ESWeapon addsGun() {
        return new ESUFOBossGun();
    }

    @Override
    public ESEngine addsEngine() {
        return new ESUFOBossEngine();
    }
}
