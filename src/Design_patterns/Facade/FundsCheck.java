package Design_patterns.Facade;

public class FundsCheck {
    private double cash_in_acc = 1000.0;

    double get_cash() {
        return cash_in_acc;
    }

    boolean withdraw(int amount) {
        if (get_cash() < amount) {
            return false;
        } else {
            cash_in_acc -= amount;
            System.out.println("transaction ok --> " + get_cash());
            return true;
        }
    }

    boolean deposit(int amount) {
        cash_in_acc += amount;
        System.out.println("transaction ok --> " + get_cash());
        return true;
    }

}
