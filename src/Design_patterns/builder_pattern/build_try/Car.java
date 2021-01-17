package Design_patterns.builder_pattern.build_try;

public class Car implements CarConcept {
    private int sits;
    private int dors;
    private String name;

    @Override
    public void set_sits_number(int number) {
        sits = number;

    }

    @Override
    public void set_dors_number(int number) {
        dors = number;

    }

    @Override
    public void set_manufacture(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car { " + name + "  with " + sits + " sits and " + dors + " dors }";
    }

}
