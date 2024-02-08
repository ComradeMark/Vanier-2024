package Feb8;


public class BankDemo {
    int accountNumber;
    String accountHolderName;
    double accountBalance;

    public static void main(String[] args) {
        BankDemo account1 = new BankDemo(11111, "Mark", 5000);
        account1.displayBalance();
    }

    public BankDemo(){

    }

    public BankDemo(int accountNumber, String accountHolderName, double accountBalance) { //Parameterized constructor
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
    }

    String getAccountHolderName() {
        return accountHolderName;
    }

    double getAccountBalance() {
        return accountBalance;

    }

    //Deposit money
    void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println(" Deposit successful");
        } else {
            System.out.println("Sucks to suck bro");

        }
    }

    //Withdraw money
    void withdraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            System.out.println("Successfully withdrawn");
        } else {
            System.out.println("Invalid");
        }
    }


    void displayBalance() {
        System.out.println(accountHolderName + " " + accountNumber + " " + accountBalance);
    }
}



