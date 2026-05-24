import java.util.*;//print the sum of first n natural numbers.

public class sum {
    public static void main(String [] args) {
        System.out.println("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for (int i =0;i<=n;i++) {
            sum = sum + i;
        }
        System.out.println("Sum = "+sum);
    }
}