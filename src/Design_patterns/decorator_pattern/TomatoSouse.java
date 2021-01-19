package Design_patterns.decorator_pattern;

public class TomatoSouse extends ToppingDecorator{
    public TomatoSouse(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding source");
    }

    @Override
    public String get_description() {
        return TempPizza.get_description() + ", tomato souse";
    }

    @Override
    public double get_price() {
        return TempPizza.get_price() + .35;
    }
}
