package Design_patterns.builder_pattern.build_try;

public class Director {
    CarBuilder cb;

    public Director(CarBuilder cb_) {
        this.cb = cb_;
    }

    // void make_car() {
    //     cb.build_dors();
    //     cb.give_name();
    //     cb.build_sits();
    // }

    // Car get_car() {
    //     return cb.get_car();
    // }


    Car create(){
        cb.build_dors();
        cb.give_name();
        cb.build_sits();

        return cb.get_car();
    }
}
