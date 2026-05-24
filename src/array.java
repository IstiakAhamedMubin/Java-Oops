import java.util.Scanner;

public class array {
    public static void main(String[] args) {
         //int [] marks = new int [3];
         //int marks [] = new int [3];
        /* marks [0] = 97;//STA
         marks [1] = 95;//ETE
         marks [2] = 100;//Java*/
        //int marks [] = {97,95,99};
       /* System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numbers: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        //input
        for(int i = 0; i<size;i++) {
            numbers[i]= sc.nextInt();
        }
        //output
        for (int i = 0; i<size; i++) {
            System.out.println("Marks = " + numbers[i]);
        }
    }
}
