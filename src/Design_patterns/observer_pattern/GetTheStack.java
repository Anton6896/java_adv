package Design_patterns.observer_pattern;

import java.text.DecimalFormat;

/**
 * will use observer pattern with threads
 */
public class GetTheStack implements Runnable {

    private int start_time;
    private String stock;
    private double price;

    private Subject stock_grabber;

    /**
     * @param stock_grabber  the Subject instance that working with
     * @param new_start_time time to reloaded the data (waite time for thread)
     * @param new_stock      what is stock name
     * @param new_price      what is stock price
     */
    public GetTheStack(Subject stock_grabber, int new_start_time, String new_stock, double new_price) {
        this.stock_grabber = stock_grabber;
        start_time = new_start_time;
        stock = new_stock;
        price = new_price;
    }

    @Override
    public void run() {

        for (int i = 0; i < 20; i++) {

            try {
                Thread.sleep(start_time * 1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // for some money change demonstration +- .03 cent in data value
            double rand_num = (Math.random() * (.06)) - .03;
            DecimalFormat df = new DecimalFormat("#.##");
            String num = df.format((price + rand_num));
            price = Double.parseDouble(num);

            // update price
            if (stock.equals("ibm")) ((StockGrabber) stock_grabber).set_ibm_price(price);
            if (stock.equals("goog")) ((StockGrabber) stock_grabber).set_goog_price(price);
            if (stock.equals("aapl")) ((StockGrabber) stock_grabber).set_aapl_price(price);

            // visual update info
            System.out.println(" -- "+stock + ":  " + df.format((rand_num)) + " updated ... \n");

        }
    }
}
