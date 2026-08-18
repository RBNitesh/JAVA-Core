import java.util.*;
import java.util.stream.Collectors;
public class EmployeeManager{
    // stores employee id and their data as key-value pair
    Map<Integer,Employee> employeeMap;

    public EmployeeManager(){
        this.employeeMap = new HashMap<>();
    }
    // add the employee
    public void addEmployee(Employee employee){
        employeeMap.put(employee.getId(), employee);
    }
    // rteurns employee with given id
    public Optional<Employee> getEmployeeById(int id){
        return Optional.ofNullable(employeeMap.get(id));
    }
    // returns the detail of all employee
    public List<Employee> getAllEmployees(){
        return new ArrayList<>(employeeMap.values());
    }
    // filter employees with atleast min salary
    public List<Employee> filterEmployeesBySalary(Double minSalary){
        return employeeMap.values().stream().filter(employee -> employee.getSalary().orElse(0.0) >= minSalary)
                .collect(Collectors.toList());
    }

    // sort employees by their salary in ascending order
    public List<Employee> sortEmployeesBySalary(){
        return employeeMap.values().stream().sorted(Comparator.comparingDouble
                (
                    (employee) -> employee.getSalary().orElse(0.0))
                )
                .collect(Collectors.toList());
    }
}