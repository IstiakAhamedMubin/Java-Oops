import java.util.Scanner;
public class ExceptionDemo3 {
    public static void main(String[] args) {
        int count = 1;
        do {
            try {
                Scanner input = new Scanner(System.in);

                System.out.print("Enter Number 1: ");
                int num1 = input.nextInt();

                System.out.print("Enter Number 2: ");
                int num2 = input.nextInt();

                int result = num1 / num2;

                System.out.println("Result: " + " num1 " + "/" + " num2 " + " = " + result);
                count = 2;
            } catch (
                    Exception e) {//for this problem if you give input as a string instead of int so than it shows InputMismatchException..so we can use this instead of Exception
                System.out.println("Exception: " + e);
                System.out.println("You must enter integer. Please try again!");
            }
        }while (count==1);
    }
}
