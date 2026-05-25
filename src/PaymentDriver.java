public class PaymentDriver {
    public static void main(String[]args) {

        Payment payment;
        //UPI Payment
        payment = new UPI();
        payment.pay(500);
        payment.receipt();
        System.out.println("------------------------");

        //Card Payment
        payment = new Card();
        payment.pay(1000);
        payment.receipt();
        System.out.println(".........................");

        //Cash Payment
        payment = new Cash();
        payment.pay(400);
        payment.receipt();
    }
}
