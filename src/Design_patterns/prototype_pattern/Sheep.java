package Design_patterns.prototype_pattern;

public class Sheep implements Animal {

    public Sheep() {
        System.out.println("\tNew sheep created");
    }

    Sheep sheep_obj;

    @Override
    public Animal make_copy() {
        try {
            sheep_obj = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("The Sheep was Turned to Mush");
            e.printStackTrace();
        }
        return sheep_obj; // <- return a clone of the main sheep
    }

    @Override
    public String toString() {
        return "amazing sheep yoooo";
    }

}
