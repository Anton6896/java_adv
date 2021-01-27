package Design_patterns.Facade;

public class BankFacade {
    private final int account_num;
    private final int sec_code;

    AccountNumberCheck accountNumberCheck;
    SCCheck scCheck;
    FundsCheck fundsCheck;

    public BankFacade(int new_acc_number, int new_sec_code) {
        account_num = new_acc_number;
        sec_code = new_sec_code;

        accountNumberCheck = new AccountNumberCheck();
        scCheck = new SCCheck();
        fundsCheck = new FundsCheck();
    }

    public int getAccount_num() {
        return account_num;
    }

    public int getSec_code() {
        return sec_code;
    }

    boolean withdraw(int amount) {
        if (accountNumberCheck.is_active(getAccount_num()) && scCheck.is_correct(getSec_code())) {
            return fundsCheck.withdraw(amount);
        }
        return false;
    }

    boolean deposit(int amount) {
        if (accountNumberCheck.is_active(getAccount_num()) && scCheck.is_correct(getSec_code())) {
            return fundsCheck.deposit(amount);
        }
        return false;
    }
}
