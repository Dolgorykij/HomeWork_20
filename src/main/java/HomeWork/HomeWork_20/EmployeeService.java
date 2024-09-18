package HomeWork.HomeWork_20;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class EmployeeService implements EmployeeServiceInterface {
    private final Map<String , Employee> employeeMap;
    private static final Integer INITIAL_CAPACITY = 5;

    public EmployeeService() {
        this.employeeMap = new HashMap<>();
        //this.employeeMap = new ArrayList<>(INITIAL_CAPACITY);
        //this.employeeMap.put(new Employee("Sara Conor", "Sara","Konor"));
        // this.employeeMap.add(new Employee("Sara1","Conor1"));
        //this.employeeMap.add(new Employee("Sara2","Conor2"));
    }

    @Override
    public Employee add(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employeeMap.containsKey(employee.fullName())) {
            throw new EmployeeAlreadyAddedException("данный человек уже есть в списке");
        }   else if (employeeMap.size()>INITIAL_CAPACITY) {
            throw new EmployeeStorageIsFullException("Слишком много сотрудников");
        }
        employeeMap.put(employee.fullName(), employee);
        return employee;
    }

    private void getKey(String firstName, String lastName) {
    }

    @Override
    public Employee find(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employeeMap.containsKey(employee.fullName())) {
            return employee;
        } else {
            throw new EmployeeNotFoundException("Человек не найден");
        }
    }

    @Override
    public Employee remove(String firstName, String lastName) {
        Employee employee = new Employee(firstName,  lastName);
        if (employeeMap.containsKey(employee.fullName())) {
            employeeMap.remove(employee);
            return employee;
        } else {
            throw new EmployeeNotFoundException("Человек не найден");
        }
    }



    @Override
    public Map<String , Employee> workerks() {
        return employeeMap;
    }

}

