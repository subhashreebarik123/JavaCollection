package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer , String> map = new HashMap<Integer , String>(); //Creating Hashmap
        map.put(1,"Mango");   //put elements in map
        map.put(2 ,"Banana");
        map.put(3 ,"Apple");
        map.put(4 ,"Grapes");
        map.put(1 ,"Orange");  //trying duplicate key

        System.out.println("Iterating Hashmap");

        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()  + "" +  m.getValue());
        }


    }


}
