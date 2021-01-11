package Design_patterns.observer_pattern;


/*
 * register and unregister user for subject (this or other)
 * user will receive an update for any change in the subject
 * */

public class GrubStocks {
    public static void main(String[] args) {
        StockGrabber sg = new StockGrabber(); // Subject

//        user / observer its an object that want
//        to be notified for any changes in current subject
        StockObserver observer_1 = new StockObserver(sg); // create user (observer)

        sg.set_ibm_price(256.6); // update price
        sg.set_goog_price(625.17); // update price
        sg.set_aapl_price(195.56);  // update price

        StockObserver observer_2 = new StockObserver(sg);  // create user
        sg.set_ibm_price(686.6); // update price

        sg.un_register(observer_1);  // delete user


//        update with using threads

        Runnable get_ibm = new GetTheStack(sg, 2, "ibm", 195.23);
        Runnable get_aapl = new GetTheStack(sg, 2, "aapl", 139.28);
        Runnable get_goog = new GetTheStack(sg, 2, "goog", 174.34);

        new Thread(get_ibm).start();
        new Thread(get_aapl).start();
        new Thread(get_goog).start();


    }
}
