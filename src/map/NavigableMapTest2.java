package map;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest2 {
        public static void main(String args[])
        {
            // Instantiate an object
            // Since NavigableMap is an interface
            // We use TreeMap
            NavigableMap<Integer, String> nmap
                    = new TreeMap<Integer, String>();

            // Add elements using put()
            nmap.put(3, "Geeks");
            nmap.put(2, "For");
            nmap.put(1, "Geeks");

            // Print the contents on the console
            System.out.println("Mappings of NavigableMap : " + nmap);
        }
    }

