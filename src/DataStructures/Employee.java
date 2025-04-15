//implementing comparator for sorting
package DataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(new Employee(21,"She"));
        employeeList.add(new Employee(12,"Dam"));
        employeeList.add(new Employee(33,"Pam"));
        employeeList.add(new Employee(4,"Jam"));
        System.out.println(employeeList);
        Collections.sort(employeeList,new EmployeComaprator());
        System.out.println(employeeList);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class EmployeComaprator implements Comparator<Employee>
{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.id- o2.id;
    }
}