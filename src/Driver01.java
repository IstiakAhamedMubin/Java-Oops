public class Driver01 {
    public static void main (String [] args) {
        Student01 s1 = new Student01();
        s1.name = "Isty";
        s1.id = 273;

        s1.printInformation("Name: " + s1.name);
        s1.printInformation("Id: "+s1.id);
        s1.printInformation("Name & Id: " +s1.name,s1.id);
    }
}
