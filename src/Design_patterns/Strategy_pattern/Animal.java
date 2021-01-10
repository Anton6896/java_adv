package Design_patterns.Strategy_pattern;

public class Animal {

    private String name;
    private static int count = 0;
    private int id;


    protected Flys fly_type;  // using interface

    Animal(String name_) {
        name = name_;
        id = ++count;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }


    //    dynamic set of object behavior !  ===========================
    public String is_flying() {
        return fly_type.fly();
    }

    public void set_fly_ability(Flys newFlyType) {
        // can change dynamically ability to do some thing
        fly_type = newFlyType;
    }

}
