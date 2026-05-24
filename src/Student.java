public class Student {
    String name;
    int age;
    double cgpa;
    int id;

    public Student (){} //Default constructor

    public Student (String name,int age,double cgpa,int id) {//parameterized constructor
        this.name = name;//using this keyword to point out the current info
        this.age = age;
        this.cgpa = cgpa ;
        this.id = id;
    }
    //copy constructor
    public Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
        this.cgpa = s2.cgpa;
        this.id = s2.id;
    }

    public void StudentInfo() {
        System.out.println("Name of the student: "+name);
        System.out.println("Age of the student: "+age);
        System.out.println("Cgpa of the Student: "+cgpa);
        System.out.println("Id of the student: "+id);
    }

}
