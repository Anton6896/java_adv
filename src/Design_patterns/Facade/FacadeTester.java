package Design_patterns.Facade;

public class FacadeTester {
    public static void main(String[] args) {
        BankFacade b = new BankFacade(123456, 1234);
        b.deposit(200);
        b.withdraw(150);
    }
}
