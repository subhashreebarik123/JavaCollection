package map;


import java.util.LinkedHashMap;

public class LinkedHashMapTest1 {
    public static void main(String[] args) {
        LinkedHashMap <Integer,String> map = new LinkedHashMap<Integer, String>();
        map.put(100,"Mama");
        map.put(101,"Bana");
        map.put(102,"Subha");
        //Fetching key
        System.out.println("Keys: "+map.keySet());
        //Fetching value
        System.out.println("Values: "+map.values());
        //Fetching key-value pair
        System.out.println("Key-Value pairs: "+map.entrySet());
    }

    }
