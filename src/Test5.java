public class Test5 {

    public static void main(String[] args) {

        Student5 s = new Student5("Istiak", 273, 2.25);

        System.out.println("Student Info: ");
        s.showInfo();

        s.setName("Abir Muhammed Borkotullah");
        s.setId(111);
        s.setCgpa(3.99);

        System.out.println("After Updates: ");
        s.showInfo();
    }
}