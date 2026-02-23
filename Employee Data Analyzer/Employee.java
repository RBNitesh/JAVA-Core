import java.util.*;

public class Employee{
    private int id;
    private String name, department;
    private double salary;

    public Employee(int id, String name, String department, double salary){
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getDepartment(){
        return this.department;
    }

    public Optional<Double> getSalary(){
        return Optional.ofNullable(salary);
    }

    @Override
    public String toString(){
        return "Employee {id = " +id + ", name = " +name+ ", department = " + department + ", salary = " + salary + "}";
    }
}