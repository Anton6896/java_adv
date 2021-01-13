package Design_patterns.abstract_factory_pattern;

public class ESUFOGun implements ESWeapon {
    public String toString() {
        /*
         * with this is can use an STRATEGY pattern -> in EnemyShip
         */
        return "20 damage";
    }
}
