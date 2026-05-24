public class BankMain extends BankAccount{
    public static void main (String[] args){
        BankAccount bankAccount = new BankAccount();

        bankAccount.deposite(100.0);
        System.out.println(bankAccount.getBalance());

        bankAccount.withDraw(200.0);
        System.out.println(bankAccount.getBalance());
    }

}
