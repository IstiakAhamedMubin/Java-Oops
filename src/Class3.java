import java.util.Scanner;

public class Class3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = scanner.nextInt();

        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        System.out.print("Enter c: ");
        int c = scanner.nextInt();

        if (a == b && b == c) {
            System.out.println("All numbers are equal");
        } else if (a >= b && a >= c) {
            System.out.println("a is the largest number");
        } else if (b >= a && b >= c) {
            System.out.println("b is the largest number");
        } else {
            System.out.println("c is the largest number");
        }
        scanner.close();
    }
}