package Design_patterns.decorator_pattern;

public class PlainPizza implements Pizza {
    @Override
    public String get_description() {
        return "thin pizza (plain)";
    }

    @Override
    public double get_price() {
        return 4.00;
    }
}
