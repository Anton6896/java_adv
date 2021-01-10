package Design_patterns.Strategy_pattern;


/// class behavior
public interface Flys {
    String fly();
}




//// class behavior type
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