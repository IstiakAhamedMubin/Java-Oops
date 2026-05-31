import java.util.Scanner;
public class ThrowKeyword {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Age: ");
            int age = scanner.nextInt();

            if (age < 18) {
                throw new IllegalArgumentException("Access Denied");
            }
            System.out.println("Access Granted");
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        }


    }
}
