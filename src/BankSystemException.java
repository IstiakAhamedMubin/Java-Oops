import java.util.Scanner;
public class BankSystemException{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 5000;
        try {

            System.out.println("Current Balance: $" + balance);
            System.out.print("Enter withdrawal amount: ");
            double amount = scanner.nextDouble();
            if (amount <= 0) {
                throw new IllegalArgumentException("Withdrawal amount must be positive.");
            }
            if (amount > balance) {
                throw new ArithmeticException("Insufficient balance.");
            }
            balance -= amount;

            System.out.println("Withdrawal Successful!");
            System.out.println("Remaining Balance: $" + balance);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        }
        catch (IllegalArgumentException e) {
            System.out.println("Invalid Input: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        }
        finally {
            System.out.println("Thank you for using our banking system.");
            scanner.close();
        }
    }
}