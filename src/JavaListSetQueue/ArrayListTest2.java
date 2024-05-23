package JavaListSetQueue;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(); // creating arraylist

        list.add("Mama"); //adding object in arraylist
        list.add("Subhashree");
        list.add("Subha");
        list.add("Jayanti");
        list.add("Bana");
        list.add("Bana");
        list.add("null");

        //using remove method
        list.remove(3);

        System.out.println(list.contains("Mama"));

        //for loop
       /* for(String name:list);
        System.out.println(list); */

        // traversing list through iterator
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println(list.get(0));


    }
}
