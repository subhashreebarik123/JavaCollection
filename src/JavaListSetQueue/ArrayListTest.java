package JavaListSetQueue;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(); // creating arraylist

        list.add("Mama"); //adding object in arraylist
        list.add("Subhashree");
        list.add("Subha");
        list.add("Jayanti");
        list.add("Bana");

        //for loop
        for(Object name:list);
        System.out.println(list);

        // traversing list through iterator
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
