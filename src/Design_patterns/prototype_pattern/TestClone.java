package Design_patterns.prototype_pattern;

public class TestClone {
    public static void main(String[] args) {

        CloneFactory cf = new CloneFactory();
        Sheep sally = new Sheep(); // object to clone

        Sheep clone_sally = (Sheep) cf.get_clone(sally); // <- return some animal (must cast)

        System.out.println(sally);
        System.out.println(clone_sally);

        System.out.println("clone_sally hash == " + System.identityHashCode(clone_sally));
        System.out.println("sally hash == " + System.identityHashCode(sally));

    }
}
