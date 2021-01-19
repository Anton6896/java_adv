package Design_patterns.decorator_pattern;

public class DecorTester {
    public static void main(String[] args) {
        Pizza basic_pizza = new TomatoSouse(new Mozzarella(new PlainPizza()));
        System.out.println("ingredient : " + basic_pizza.get_description());
        System.out.println("price : " + basic_pizza.get_price());
    }
}
