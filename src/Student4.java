public class Student4{
    private int id;
    private String name;
    private double cgpa;

    public Student4 (){}

    public Student4(int id,String name,double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    public int getId () {
        return id;
    }
    public String getName () {
        return name;
    }
    public double getCgpa(){
        return cgpa;
    }
    public void setId (int id){
        this.id =id;
    }
    public void setName (String name ){
        this.name = name;
    }
    public void setCgpa(double cgpa) {
        if (cgpa >= 2.50 && cgpa <= 4.00) {
            this.cgpa = cgpa;
        }
        else {
            System.out.println("Fail");
        }
    }
}
