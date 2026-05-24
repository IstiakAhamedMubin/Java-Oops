import java.util.*;

public class pattern1 {//print the pattern with user input(Solid Rectangle)

    public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int k = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int m = sc.nextInt();

         for (int i = 1; i<=k; i++) {
             for (int j = 1;j<=m; j++) {
                 System.out.print("* ");
             }
                  System.out.println(" ");
         }
    }
}