package JavaListSetQueue;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {


        Vector<String> v = new Vector<String>();
        v.add("Ayush");
        v.add("Amit");
        v.add("Ashish");
        v.add("Garima");
        v.add(null);
        Iterator<String> itr = v.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
