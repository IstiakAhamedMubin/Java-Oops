import java.util.Scanner;
public class factorial {
    public static void PrintFactorial (int n ) {
        if (n<0) {
            System.out.println("Invalid State");
        }
        int factorial =1;

        for (int i =n;i>=1;i--) {
            factorial = factorial*i;
        }
        System.out.println("Factorial = "+factorial);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        PrintFactorial(n);

    }
}
