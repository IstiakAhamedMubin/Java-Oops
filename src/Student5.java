public class Student5 {

    private String name;
    private int id;
    private double cgpa;

    public Student5(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public double getCgpa() {
        return cgpa;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
    public void showInfo() {
        System.out.println("Name: " + name + "\nId: " + id + "\nCgpa: " + cgpa);
    }
}