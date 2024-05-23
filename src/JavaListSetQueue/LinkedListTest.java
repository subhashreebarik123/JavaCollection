package JavaListSetQueue;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>(); // creating arraylist

        linkedList.add("Mama"); //adding object in arraylist
        linkedList.add("Subhashree");
        linkedList.add("Subha");
        linkedList.add("Jayanti");
        linkedList.add("Bana");

        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for(String name: linkedList){
            System.out.println(name);

        }

        for(int i=0;i<linkedList.size();i++){
            System.out.println(linkedList.get(i));
        }

    }
}


