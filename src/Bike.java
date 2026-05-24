public class Bike extends Vehicle{
    public Bike (String brand,int year){
        super(brand,year);
    }
    @Override
    public void FuelType() {
        System.out.println("Fueltype: Petrol");
    }
    @Override
    public void MaxSpeed() {
        System.out.println("MaxSpeed:300km/h");
    }
}
