package Design_patterns.observer_pattern;

public class GrubStocks {
    public static void main(String[] args) {
        StockGrabber sg = new StockGrabber();
        StockObserver observer_1 = new StockObserver(sg);

        sg.set_Ibm_price(256.6);
        sg.set_Goog_price(625.17);
        sg.set_Aapl_price(195.56);

        StockObserver observer_2 = new StockObserver(sg);
        sg.set_Ibm_price(686.6);
//        sg.set_Goog_price(525.17);
//        sg.set_Aapl_price(695.56);
//
//        sg.un_register(observer_1);

    }
}
