import java.util.Scanner;

public class matrixSearchX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter Columns: ");
        int columns = sc.nextInt();

        int numbers[][] = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter number for position (" + i + "," + j + "): ");
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter X for search: ");
        int x = sc.nextInt();

        for (int i = 0;i<rows;i++) {
            for(int j = 0; j < columns; j++) {
                if(numbers[i][j]==x) {
                    System.out.println("x found at location: (" + i + "," + j + ")");
                }
            }
        }
    }
}