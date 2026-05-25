public class ExceptionDemo1 {
    public static void main (String[] args) {
        try {
            int x = 50;
            int y = 0;

            int result = x / y;

            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e1) {
            System.out.println("Exception: " + e1);
        }
        catch (Exception e2) {//all exception handle kore
            System.out.println("Exception: "+e2);
        }
        finally {
            System.out.println("Last line of the code");
        }
    }
}
