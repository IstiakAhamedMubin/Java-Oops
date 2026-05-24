public class Train extends Vehicle{
    public Train(String brand,int year) {
        super(brand, year);
    }
    @Override
    public void FuelType() {
        System.out.println("FuelType: Gas/Diesel/electricity");
    }
    @Override
    public void MaxSpeed() {
        System.out.println("Max Speed: 300km/h");
    }
}
