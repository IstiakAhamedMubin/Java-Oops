public class Test7 {
    public static void main(String[] args) {

        Student7[] students = {
                new Student7("Himel", 284, 3.89),
                new Student7("Abdul Ahad", 140, 3.88),
                new Student7("Rifat", 124, 3.90),
                new Student7("Shoriful", 159, 3.85),
                new Student7("Istiak", 273, 2.25)
        };

        System.out.println("All Students");
        for (Student7 s : students) {
            s.display();
        }
        Student7 top = students[0];
        for (Student7 s : students) {
            if (s.getCgpa() > top.getCgpa()) {
                top = s;
            }
        }
        System.out.println("\nTop Student: " + top.getName() + " | CGPA: " + top.getCgpa());

        for (Student7 s : students) {
            s.setCgpa(s.getCgpa() + 0.10);
        }
        System.out.println("\nAfter Bonus");
        for (Student7 s : students) {
            s.display();
        }
    }
}