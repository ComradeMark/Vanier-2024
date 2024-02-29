package Feb29;
import java.util.Scanner;
public class ExceptionDemo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter initial balance: ");
            double initialBalance = scanner.nextDouble();

            //Nested try-catch block
            try {
                System.out.println("Enter amount to withdraw: ");
                double withdrawalAmount = scanner.nextDouble();
                validateWithdrawalAmount(withdrawalAmount);
                double remainingBalance = updateBalance(initialBalance, withdrawalAmount);
                System.out.println("Updated balance after withdrawal: " + remainingBalance);
            } catch (InvalidWithdrawalException e) {
                System.out.println("Invalid withdrawal amount:" + e.getMessage());
            } catch (Exception e) {
                System.out.println("An error occured: " + e.getMessage());
            }
            }
        finally {
            System.out.println("Final block executed");
            scanner.close();
        }
    }

    private static double updateBalance(double initialBalance, double withdrawalAmount)throws InsufficientFundsException {
        if(withdrawalAmount > initialBalance){
            throw new InsufficientFundsException(" Insufficient funds for withdrawal");
        }
    return initialBalance - withdrawalAmount;}

    private static void validateWithdrawalAmount(double withdrawalAmount)throws InvalidWithdrawalException{
        if(withdrawalAmount <=0){
            throw new InvalidWithdrawalException(" Withdrawal amount must be greater than zero");
        }
    }
static class InvalidWithdrawalException extends Exception{ //Defines our custom exception
        public InvalidWithdrawalException(String message){
            super(message);
        }
}
static class InsufficientFundsException extends Exception{
        public InsufficientFundsException(String message){
            super(message);
        }
}
}



