package Design_patterns.Strategy_pattern;

public class Dog extends Animal {

    void dig_hole() {
        System.out.println("digging hole , i am doggy ...");
    }

    Dog(String name_) {
        super(name_);

        // set default ability
        fly_type = new ItDidFlays();
    }

}
