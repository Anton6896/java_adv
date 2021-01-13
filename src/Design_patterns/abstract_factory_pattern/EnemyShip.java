package Design_patterns.abstract_factory_pattern;

public abstract class EnemyShip {
    private String name;

//    strategy designed implementation
    ESEngine esEngine; // <- composition
    ESWeapon esWeapon;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setEsEngine(ESEngine newEngine) {
        esEngine = newEngine;
    }

    public void setEsWeapon(ESWeapon newWeapon) {
        esWeapon = newWeapon;
    }

    abstract void makeShip();

    public void followHeroShip() {
        System.out.println(getName() + "following the hero ship " + esEngine);
    }

    public void displayEnamyShip() {
        System.out.println(getName() + " on the screen");
    }

    public void enemyShipShuts() {
        System.out.println(getName() + " is shutting");
    }

    public String toString() {
        return getName() + " have an " + esEngine + " and can attack with " + esWeapon;
    }

}
