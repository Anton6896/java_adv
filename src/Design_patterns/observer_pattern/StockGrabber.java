package Design_patterns.observer_pattern;

import java.util.ArrayList;
import java.util.List;

// use subject interface for notification of changes
public class StockGrabber implements Subject {

    private final List<Observer> observers_list;

    private double ibm_price;
    private double goog_price;
    private double aapl_price;

    public StockGrabber() {
        observers_list = new ArrayList<>();
    }

    public void register(Observer new_observer) {
        observers_list.add(new_observer);
    }

    public void un_register(Observer delete_obserer) {
        int position = observers_list.indexOf(delete_obserer);
        observers_list.remove(position);
        System.out.println("observer removed from position : " + (position + 1));
    }

    public void notify_observer() {
        observers_list.forEach(observer -> observer.update(ibm_price, aapl_price, goog_price));
    }

    public void set_Ibm_price(double new_ibm_price) {
        this.ibm_price = new_ibm_price;
        notify_observer();
    }

    public void set_Aapl_price(double new_aapl_price) {
        this.aapl_price = new_aapl_price;
        notify_observer();
    }

    public void set_Goog_price(double new_goog_price) {
        this.goog_price = new_goog_price;
        notify_observer();
    }


}
