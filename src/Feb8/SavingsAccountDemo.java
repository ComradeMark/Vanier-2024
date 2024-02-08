package Feb8;

public class SavingsAccountDemo extends BankDemo {

    double interestRate;
    double minBalance;

    public SavingsAccountDemo(double interestRate, double minBalance) {
        this.interestRate = interestRate;
        this.minBalance = minBalance;
    }

    public SavingsAccountDemo(int accountNumber, String accountHolderName, double accountBalance, double interestRate, double minBalance) {
        super(accountNumber, accountHolderName, accountBalance);
        this.interestRate = interestRate;
        this.minBalance = minBalance;
    }
}

