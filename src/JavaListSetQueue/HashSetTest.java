package JavaListSetQueue;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    public static void main(String[] args) {


    HashSet<String> set=new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        set.add(null);
        set.add(null);
    //Traversing elements
    Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
        System.out.println(itr.next());
    }
}
}
