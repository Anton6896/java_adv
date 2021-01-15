package Design_patterns.singleton_pattern;

import java.util.List;

public class Tester {
    public static void main(String[] args) {

        Singleton instance = Singleton.getInstance();  // <- class creation
        System.out.println(" id  -- > " + System.identityHashCode(instance));

        System.out.println(instance.getCharList().toString());
        List<Character> p1 = instance.getTailsList(7);
        System.out.println(instance.getCharList().toString());

        System.out.println("\n =======  other instance is created ======");
        // create second user for instance
        Singleton instance2 = Singleton.getInstance();  // <- class creation
        System.out.println(" id  -- > " + System.identityHashCode(instance));

        List<Character> p2 = instance2.getTailsList(7);
        System.out.println(instance.getCharList());


    }
}
