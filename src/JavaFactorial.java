public class JavaFactorial {
    public static void main(String[] args){
        //5! = 5 * 4 * 3 * 2 * 1 = 120

        System.out.println(factorial(5));

    }
    public static int factorial( int n) {
        if ( n == 0 || n==1) { //funny base case
            return 1;
        }else {
            return n * factorial(n-1);
        }
    }
}
