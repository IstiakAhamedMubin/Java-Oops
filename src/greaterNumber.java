import java.util.Scanner;

public class greaterNumber {
     public static int GreaterNum(int a,int b) {
         if (a>b){
             return a;
         }else {
             return b;
         }
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

       // int result = GreaterNum(a,b);
        //System.out.println("The greater number is : "+result);
        System.out.println("Greater number is: " + GreaterNum(a, b));//we can also write this
    }

}

