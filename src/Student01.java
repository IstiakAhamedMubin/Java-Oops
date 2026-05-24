public class Student01 {
    String name;
    int  id;

    public Student01 (){}

    public void printInformation(String name) {
        System.out.println(name);
    }
    public void printInformation (int id) {
        System.out.println(id);
    }
    public void printInformation (String name, int id) {
        System.out.println(name+" "+ id);
    }
}
//this is compile-time polymorphism which is method overloading
