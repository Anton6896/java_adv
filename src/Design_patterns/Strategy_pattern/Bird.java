package Design_patterns.Strategy_pattern;

public class Bird extends Animal {

    void butty() {
        System.out.println("sitting on the flower ");
    }

    Bird(String name_) {
        super(name_);
        // set default ability
        set_fly_ability(new ItFlays());
    }
}
