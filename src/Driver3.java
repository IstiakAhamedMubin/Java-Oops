public class Driver3 extends Student3 {
    public static void main(String[] args) {
        Student3 student = new Student3();
        student.Set("Istiak",21);
        int Age = student.getAge();
        String Name = student.getName();

        System.out.println("Name: " + Name + "\nAge: " + Age);
    }
}

