import java.util.Scanner;
public class FunctionMultiplier {
    public static int CalculateMultiplier(int a , int b) {
        return a * b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a: ");
        int a = sc.nextInt();
        System.out.print("enter b: ");
        int b = sc.nextInt();

        System.out.println("The multiply of this two numbers is: "+CalculateMultiplier(a,b));
    }
}
