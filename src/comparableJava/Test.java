package comparableJava;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

    public static void main(String[] args) {


        Student student1 = new Student(1,"sujit");
        Student student2 = new Student(10,"ram");
        Student student3 = new Student(14,"sham");

        ArrayList<Student> list = new ArrayList<Student>();
        list.add(student1);
        list.add(student2);
        list.add(student3);

        Collections.sort(list);

        for (Student student:list){
            System.out.println(student.age
            );
        }
    }
}
