public class Card implements Payment{

    public void pay(double amount) {
        System.out.println("paid " + amount + " using debit/credit Card");
    }
}
