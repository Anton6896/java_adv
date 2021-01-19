package Design_patterns.decorator_pattern;

public class Mozzarella extends ToppingDecorator {
    public Mozzarella(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding to pizza ");
        System.out.println("Adding Mozzarella");
    }


    @Override
    public String get_description() {
        return TempPizza.get_description() + ", Mozzarella";
    }

    @Override
    public double get_price() {
        return TempPizza.get_price() + .50;
    }
}
