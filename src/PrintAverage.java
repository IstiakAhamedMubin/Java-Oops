import java.util.Scanner;

public class PrintAverage {
    public static double CalculateAverage(int a,int b, int c) {
        double average =(a+b+c)/3.0;
        return average;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter a: ");
            int a = sc.nextInt();

            System.out.print("Enter b: ");
            int b = sc.nextInt();
            System.out.print("Enter c: ");
            int c = sc.nextInt();

            double average = CalculateAverage(a,b,c);

        System.out.println("The three numbers average: "+average);
        sc.close();
    }
}
