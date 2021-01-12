package Design_patterns.factory_pattern;

public class EnemyShipFactory {

//    factory method that return dynamic object that depend on call
    public EnemyShip makeEnemyShip(String newShipType) {

        return switch (newShipType) {
            case "U" -> new UFOEnemyShip();
            case "R" -> new RocketEnemyship();
            case "B" -> new BigUFOEnemyShip();
            default -> null;
        };
    }
}
