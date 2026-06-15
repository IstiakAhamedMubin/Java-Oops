
import java.util.ArrayList;
import java.util.ArrayList.*;
import java.util.Collection;
import java.util.Collections;
public class ArrayListFinalBoss {
    public static void main (String [] args) {

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Licchi");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Watermelon");

        Collections.sort(fruits);

        for(int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        System.out.println(fruits);

        System.out.println(fruits.get(2));
        fruits.remove(0);
        System.out.println(fruits);
        fruits.set(1,"Banana");

        System.out.println(fruits);

        System.out.println("Size: "+fruits.size());

        fruits.clear();
        System.out.println(fruits);
    }
}
