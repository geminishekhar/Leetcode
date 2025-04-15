//Using Comparable implementation
//must be in the same class
package DataStructures;

import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student> {
    int id;
    String name;
    public Student(int id,String name)
    {
        this.id=id;
        this.name=name;
    }



    public static void main(String[] args) {
        Student s1=new Student(21,"She");
        Student s2=new Student(12,"Gemini");
        Student s3=new Student(33,"Saple");
        Student s4=new Student(14,"sarthi");
        ArrayList<Student> studentList= new ArrayList<Student>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        System.out.println(studentList);
        Collections.sort(studentList);
        System.out.println(studentList);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student s) {
        return this.name.compareTo(s.name);
    }
}
