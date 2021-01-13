package Design_patterns.Strategy_pattern;

public class Dog extends Animal {

    void dig_hole() {
        System.out.println("digging hole , i am doggy ...");
    }

    Dog(String name_) {
        super(name_); // send name to Animal (father)

        // set default ability  (using pattern)
        set_fly_ability(new ItDidFlays());
    }

}
