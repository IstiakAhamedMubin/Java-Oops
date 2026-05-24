import java.util.*;
public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int columns = sc.nextInt();

        int numbers [][] = new int [rows][columns];
        //input
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        //output
        for(int i = 0;i<rows;i++) {
            for(int j = 0; j<columns;j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}