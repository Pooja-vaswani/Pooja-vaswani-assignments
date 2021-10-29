import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Employee {
    private long id;
    private String name;
    private int salary;
    private String department;

    public Employee(long id, String name,int salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

   
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +", salary='" + salary + '\'' +", dep='" + department + '\'' +
                '}';
    } 
}
public class  HashSetUserDefinedObjectExample{
    public static void main(String[] args) {
        Set<Employee> employee = new HashSet<>();
        employee.add(new Employee(101, "Rajeev",10000,"IT"));
        employee.add(new Employee(102, "Sachin",30000,"IT"));
        employee.add(new Employee(103, "Chris",2000,"Consultant"));

        /*
          HashSet will use the `equals()` & `hashCode()` implementations 
          of the Customer class to check for duplicates and ignore them
        */
        employee.add(new Employee(101, "Rajeev",10000,"IT"));

        System.out.println(employee);
       
    }
}
