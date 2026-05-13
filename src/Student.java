public class Student {
    String name;
    int age;
    double cgpa;
    int id;

    public Student (){}

    public Student (String name,int age,double cgpa,int id) {
        this.name = name;
        this.age = age;
        this.cgpa = cgpa ;
        this.id = id;
    }
    public void StudentInfo() {
        System.out.println("Name of the student: "+name);
        System.out.println("Age of the student: "+age);
        System.out.println("Cgpa of the Student: "+cgpa);
        System.out.println("Id of the student: "+id);
    }

}
