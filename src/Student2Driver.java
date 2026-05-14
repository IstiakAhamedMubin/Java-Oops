public class Student2Driver {
    public static void main(String[]args) {
        Student2 s1 = new Student2();
        Student2 s2 = new Student2("Istiak_Ahamed_Mubin");
        Student2 s3 = new Student2("Shuvo",21);
        Student2 s4 = new Student2("Sazzad",22,"A+");
        Student2 s5 = new Student2("MohoshenRezaShohan",22,"A+",3.93f);

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
        s4.displayInfo();
        s5.displayInfo();
    }
}
