public class Student7 {

    private String name;
    private int id;
    private double cgpa;

    public Student7(String name, int id, double cgpa) {
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
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
    public void display() {
        System.out.println(name + " | ID: " + id + " | CGPA: " + cgpa);
    }
}