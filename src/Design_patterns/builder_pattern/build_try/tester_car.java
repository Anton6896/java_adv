package Design_patterns.builder_pattern.build_try;

public class tester_car {
    public static void main(String[] args) {
        CarBuilder cb = new OldCar();
        Director dir = new Director(cb);

        Car car1 = dir.create();

        System.out.println(car1);
    }
}
