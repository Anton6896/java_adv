package Design_patterns.factory_pattern;

public abstract class EnemyShip {
    private String name;
    private double speed, x_direction, y_direction, damage_amount;

//    ========

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public double getDamage_amount() {
        return damage_amount;
    }

    public void setDamage_amount(double newDamage) {
        this.damage_amount = newDamage;
    }

//    =========

    public void displayEnemyShip() {
        System.out.println(getName() + " is on screen ");
    }

    public void enemyShipShutting() {
        System.out.println(getName() + " shutting with " + getDamage_amount() + "to other ships");
    }

    public void followingAnHero() {
        System.out.println(getName() + " is following an a hero ");
    }


}
