package Design_patterns.factory_pattern;

public class EnemyShipFactory {

    // factory method that return dynamic object that depend on call
    public EnemyShip makeEnemyShip(String newShipType) {

        // return switch (newShipType) {
        // // java 14+
        // case "U" -> new UFOEnemyShip();
        // case "R" -> new RocketEnemyship();
        // case "B" -> new BigUFOEnemyShip();
        // default -> null;
        // };

        EnemyShip ship = null;
        switch (newShipType) {
            case "U":
                return new UFOEnemyShip();
            case "R":
                return new RocketEnemyship();
            case "B":
                return new BigUFOEnemyShip();
            default:
                return null;
        }
    }
}
