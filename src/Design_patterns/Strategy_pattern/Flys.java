package Design_patterns.Strategy_pattern;

public interface Flys {
    String fly();
}


class ItFlays implements Flys{

    @Override
    public String fly() {
        return "Flying high  :) ";
    }
}
class ItDidFlays implements Flys{

    @Override
    public String fly() {
        return "cant fly at all :(";
    }
}