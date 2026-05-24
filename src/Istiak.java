import java.util.Scanner;

public class Istiak {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        int sum = 0;
        int iterations = 6;

        for (int i = 0; i < iterations; i++) {
            sum += (a + b);
            System.out.println("Iteration " + (i + 1) +
                    " -> Value of sum = " + sum);
        }

        sc.close();
    }
}