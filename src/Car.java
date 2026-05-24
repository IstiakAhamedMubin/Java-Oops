public class Car {
    String make = "Bugatti Chiron";
    String model = "Chiron Super Sport";
    int year = 2024;
    String color = "Blue";
    String fuelType = "Petrol";
    String topSpeed = "490 km/h";
    double price = 491780656.00;//4 million dollar
    boolean isRunning = false;

    void start() {
        isRunning = true;
        System.out.println("I start the engine");
    }
    void stop () {
        isRunning = false;
        System.out.println("i stop the engine");
    }
    void drive() {
        System.out.println("i am driving "+model);
    }
    void brake () {
        System.out.println("i brake "+ make);
    }
}
