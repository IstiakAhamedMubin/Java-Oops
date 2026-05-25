public class ExceptionDemo2 {
    public static void main (String[] args) {
        try {
           int [] arr = new int [5];
           arr [5] = 100;//array r index 0 theke start hoy so 5 size r array te 0-4 porjonto but aikhane 5 ase so aitao akta error
        }
        catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("Exception: " + e1);
        }
        catch (Exception e2) {//super exception
            System.out.println("Exception: "+e2);
        }
        finally {
            System.out.println("Last line of the code");
        }
    }
}
