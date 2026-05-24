public abstract  class Vehicle {
    String brand;
    int year;

    public Vehicle (String brand,int year) {
        this.brand = brand;
        this.year = year;
    }
    //abstract method(Different for each vehicle)
    public abstract void FuelType();
    public abstract void MaxSpeed();

    //concrete method(same for all vehicle)
    public void DisplayInfo() {
        System.out.println("Brand: " + brand + "Year: " + year);
    }
    public void start() {
        System.out.println(brand + " is starting.......");
    }

}
