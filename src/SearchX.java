import java.util.Scanner;//linear search
public class SearchX {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numbers: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        //input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + " : ");
            numbers[i] = sc.nextInt();
        }
        //output
        System.out.print("Enter X: ");
        int x = sc.nextInt();

        for (int i = 0; i <numbers.length ; i++) {
            if (numbers[i] == x) {
                System.out.println("X found at index = " + i);
            }
        }
    }
}