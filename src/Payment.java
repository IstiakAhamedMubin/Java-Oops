public interface Payment {

    public void pay(double amount); // abstract method
    default void receipt() {
        System.out.println("Receipt generated successfully");
    }
}