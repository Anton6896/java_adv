package Design_patterns.builder_pattern.build_try;

public class OldCar implements CarBuilder {

    Car car;

    public OldCar() {
        car = new Car();
    }

    @Override
    public void build_sits() {
        car.set_sits_number(4);

    }

    @Override
    public void build_dors() {
        car.set_dors_number(4);

    }

    @Override
    public void give_name() {
        car.set_manufacture("Old Car Manufacture");

    }

    @Override
    public Car get_car() {
        return car;

    }

}
