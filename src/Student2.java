public class Student2 {
    String name;
    int age;
    String grade;
    float cgpa;

    //default constructor no parameter
    Student2 () {
        this.name = "Unknown";
        this.age = 0;
        this.grade = "N/A";
        this.cgpa = 0.0f;
    }
    Student2 (String name) {
        this.name = name;
        this.age = 0;
        this.grade = "N/A";
        this.cgpa = 0.0f;

    }
    Student2 (String name,int age) {
        this.name = name;
        this.age = age;
        this.grade = "N/A";
        this.cgpa = 0.0f;
   }
   Student2 (String name,int age,String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.cgpa = 0.0f;

   }
   Student2 (String name,int age ,String grade,float cgpa) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.cgpa = cgpa;
   }
   public void displayInfo () {
       System.out.println("Name: " + name + ",Age: " + age + ",Grade: " + grade + ",Cgpa: " + cgpa);
   }
}