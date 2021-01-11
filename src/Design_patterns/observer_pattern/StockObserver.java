package Design_patterns.observer_pattern;

public class StockObserver implements Observer {

    private double ibm_price;
    private double goog_price;
    private double aapl_price;

    private static int observer_id_couner = 0;
    private int observer_id;

    private Subject stock_grabber;

    public StockObserver(Subject stock_grabber) {
        this.stock_grabber = stock_grabber; // save an reference of StockGrabber that working with
        observer_id = ++observer_id_couner;
        System.out.println("\nNew observer ___ " + observer_id + " ___ ");
        stock_grabber.register(this); // add to list in StockGrabber
    }

    @Override
    public void update(double ibm_price, double aapl_price, double goog_price) {
//        get new data from StockGrabber and update the current data
//        in observer object
        this.ibm_price = ibm_price;
        this.goog_price = goog_price;
        this.aapl_price = aapl_price;

//        print all data (inner use)
        show_price();
    }

    private void show_price() {
        System.out.println(observer_id +
                "\nibm: " + ibm_price +
                "\ngoog: " + goog_price +
                "\naapl: " + aapl_price);
    }
}
