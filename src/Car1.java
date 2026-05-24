public class Car1 extends Vehicle {
    public Car1(String brand,int year){
        super(brand,year);//super calls parent class constructor then it access parent class veriable
    }
    @Override
    public void FuelType () {
        System.out.println("FuelType: Petrol/Diesel");
    }
    @Override
    public void MaxSpeed () {
        System.out.println("Maxspeed: 190km/h");
    }
}
