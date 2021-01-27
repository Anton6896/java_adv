package Design_patterns.Facade;

public class AccountNumberCheck {
    private int acc_num = 123456;

    int getAcc_num() {
        return acc_num;
    }

    boolean is_active(int numb) {
        return getAcc_num() == numb;
    }
}
