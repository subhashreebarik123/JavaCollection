package comparableJava;

public class Employee implements Comparable<Employee>{

    String name ;
    int age;
    int rollno;
    Employee(String name , int age , int rollno){
        this.name=name;
        this.age=age;
        this.rollno=rollno;
    }

    @Override
    public int compareTo(Employee e) {
        if(age==e.age)
            return 0;
        else if(age>e.age)
            return -1;
        else
            return 1;
    }


}
