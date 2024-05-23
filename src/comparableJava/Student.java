package comparableJava;

public class Student implements Comparable<Student>{


    Integer age;
    String name;

    Student(int ageone, String nameone){
        age = ageone;
        name = nameone;
    }
    @Override
    public int compareTo(Student o) {

     return age.compareTo(o.age);
    }
}
