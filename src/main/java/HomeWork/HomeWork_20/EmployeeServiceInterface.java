package HomeWork.HomeWork_20;

import java.util.List;
import java.util.Map;

public interface EmployeeServiceInterface {
    Employee add(String firstName, String lastName, int department, int salary);

    Employee find(String firstName, String lastName, int department, int salary);

    Employee remove(String firstName, String lastName);

    List<Employee> workerks();
}

