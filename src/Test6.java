public class Test6 {
    public static void main(String[] args) {

        System.out.println("Using No-argument Constructor:");
        Student6 s1 = new Student6();
        s1.showInfo();

        System.out.println("\nUsing full Constructor: ");
        Student6 s2 = new Student6("Sajjad", 425, 3.70);
        s2.showInfo();

        System.out.println("\nGraduate Student: ");
        GraduateStudent6 g = new GraduateStudent6("Rimon", 352, 3.75, "Machine Learning");
        g.showInfo();

        g.setCgpa(3.78);
        System.out.println("\nAfter updating CGPA: ");
        g.showInfo();
    }
}