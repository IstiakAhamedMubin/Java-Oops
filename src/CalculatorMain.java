public class CalculatorMain {

    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println(c.add(5, 3));
        System.out.println(c.add(5.5, 2.5));
        System.out.println(c.add(1, 2, 3));
    }
}
