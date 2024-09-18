package HomeWork.HomeWork_20;

import java.util.Map;

public interface EmployeeServiceInterface {
    Employee add(String firstName, String lastName);

    Employee find(String firstName, String lastName);

    Employee remove(String firstName, String lastName);

    Map<String , Employee> workerks();
}

