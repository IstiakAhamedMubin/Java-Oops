public class VehicleTest {
    public static void main(String[] args) {
        Vehicle v1 = new Car1 ("BMW-G82",2020);
        Vehicle v2 = new Bike ("Yamaha",2018);
        Vehicle v3 = new Train("Sigma Express",2016);

        System.out.println("----Car Info-----");

        v1.DisplayInfo();
        v1.start();
        v1.FuelType();
        v1.MaxSpeed();

        System.out.println("\nBike Info -----");

        v2.DisplayInfo();
        v2.start();
        v2.FuelType();
        v2.MaxSpeed();

        System.out.println("\nTrain Info----");
        v3.DisplayInfo();
        v3.start();
        v3.FuelType();
        v3.MaxSpeed();
    }
}
