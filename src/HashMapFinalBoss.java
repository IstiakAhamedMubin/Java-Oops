import java.util.HashMap;
public class HashMapFinalBoss {
    public static void main(String[] args) {
        HashMap<Integer,String> student = new HashMap<>();

        student.put(1,"John");
        student.put(2,"Alice");
        student.put(3,"Bob");
        student.put(4,"Boyed");

        System.out.println(student);

        System.out.println(student.get(2));

        student.remove(1);
        System.out.println(student);

        student.put(2,"Charlie");
        System.out.println(student);

        System.out.println("Size: "+student.size());

        student.clear();
        System.out.println(student);

    }
}
