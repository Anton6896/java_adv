package Design_patterns.Facade;

public class SCCheck {
    private int sc_code = 1234;

    int getSc_code() {
        return sc_code;
    }

    boolean is_correct(int num) {
        return getSc_code() == num;
    }
}
