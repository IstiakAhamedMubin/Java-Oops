public class Driver {
    public static void main (String[]args) {
        Pen p1 = new Pen();
        p1.color = "Red";
        p1.type = "Gel";

        p1.write();

        Pen p2 = new Pen();
        p2.color ="Black";
        p2.type = "Ballpoint";

        p1.PrintColor();
        p2.PrintColor();

        Student s1 = new Student("Istiak_Ahamed",21,3.54,273);
        System.out.println("Information of Student s1: ");
        s1.StudentInfo();

        System.out.println();

        Student s2 = new Student(s1);

        System.out.println("Information of Student s1: ");
        s2.StudentInfo();

    }
}
