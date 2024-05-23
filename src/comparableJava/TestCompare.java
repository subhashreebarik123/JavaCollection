package comparableJava;

import java.util.ArrayList;
import java.util.Collections;

public class TestCompare {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Mama",20,122);
        Employee employee2 = new Employee(" Subha",22,120);
        Employee employee3 = new Employee("Subhashree",30,222);

        ArrayList<Employee>list = new ArrayList<Employee>();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);

        Collections.sort(list);

        for(Employee employee:list){
            System.out.println(employee.age);
        }


    }
}
