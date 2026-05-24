public class Driver4 extends Student4{
    public static void main (String[] args){
        Student4 student = new Student4(273,"Istiak Ahamed",3.54);

        System.out.println("Name: " + student.getName()+"\nId:"+student.getId()+"\nCpga: "+student.getCgpa());
        System.out.println();
        student.setCgpa(2.00);
        System.out.println("Cgpa:" + student.getCgpa());
    }
}
