import java.util.*;//print the table of a number input by the user.
public class Class2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Numbers: ");
        int number = sc.nextInt();

        for(int i =1;i<=10;i++) {
            System.out.println(number + "x" + i + "=" + (number * i));
        }
    }
}