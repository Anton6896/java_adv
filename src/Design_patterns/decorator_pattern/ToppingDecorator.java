package Design_patterns.decorator_pattern;

abstract class ToppingDecorator implements Pizza {

    protected Pizza TempPizza;

    public ToppingDecorator(Pizza newPizza) {
        TempPizza = newPizza;
    }

    @Override
    public String get_description() {
        return TempPizza.get_description();
    }

    @Override
    public double get_price() {
        return TempPizza.get_price();
    }
}
