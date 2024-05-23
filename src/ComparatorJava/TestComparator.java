package ComparatorJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestComparator {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(new Student("Mama", 20, 100));
        al.add(new Student("Subha", 25, 101));
        al.add(new Student(" Subhashree", 24, 102));

        System.out.println("Sorting by name");

        Collections.sort(al, new NameComparator());
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            Student st = (Student) itr.next();
            System.out.println(st.name + " " + st.age + " " + st.rollno);
        }
        System.out.println("Sorting by age");

        Collections.sort(al, new AgeComparator());
        Iterator itr2 = al.iterator();
        while (itr2.hasNext()) {
            Student st2 = (Student) itr2.next();
            System.out.println(st2.name + " " + st2.age + " " + st2.rollno);
        }

    }

    }

