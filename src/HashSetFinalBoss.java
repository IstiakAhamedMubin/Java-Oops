import java.util.HashSet;
public class HashSetFinalBoss {
    public static void main(String[] args) {
        HashSet<String>students = new HashSet<String>();

        students.add("isty");
        students.add("Alice");
        students.add("Kirito");
        students.add("kirito");
        System.out.println(students);

        System.out.println(students.contains("isty"));
        students.remove("Alice");
        System.out.println(students);
        System.out.println("Size: "+students.size());
    }
}
