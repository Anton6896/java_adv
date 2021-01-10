package Design_patterns.Strategy_pattern;

/*
    the point is to crete interface that allows
    to make the special behavior to the class
    in this case behavior is fly (can be any thing)

    will be hidden implementation behavior that user can use
    is animal can fly
*/

public class S_Tester {
    public static void main(String[] args) {
        Animal doggy = new Dog("pike");
        Animal birdy = new Bird("pipi");

        System.out.println(doggy);
        System.out.println(birdy);
        System.out.println("doggy : " + doggy.is_flying());
        System.out.println("birdy : " + birdy.is_flying());
        birdy.set_fly_ability(new ItDidFlays());
        System.out.println("birdy (change behavior): " + birdy.is_flying());



    }
}
