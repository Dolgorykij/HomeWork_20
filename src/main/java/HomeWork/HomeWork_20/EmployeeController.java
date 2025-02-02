package HomeWork.HomeWork_20;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }
    @GetMapping("/add")
    public Employee add (@RequestParam ("firstName") String firstName,
                         @RequestParam ("lastName") String lastName) {
        // try {
        // final Employee employee = employeeService.add(firstName,lastName);
        // return firstName + lastName;
        return employeeService.add(firstName,lastName);
        // } catch (EmployeeAlreadyAddedException e) {
        //  return "Пользователь" + firstName + " " + lastName + " уже добавлен";
        // }
    }

    @GetMapping("/remove")
    public Employee remove (@RequestParam   ("firstName") String firstName,
                            @RequestParam ("lastName")  String lastName) {
        return employeeService.remove(firstName,lastName);
    }
    @GetMapping("/find")
    public Employee find    (@RequestParam  ("firstName") String firstName,
                             @RequestParam  ("lastName")  String lastName) {
        //try {
        // final Employee employee = employeeService.find(firstName, lastName);
        // return employeeService.remove(firstName,lastName);
        //  }   catch (EmployeeNotFoundException e) {
        //  return employeeService.remove(firstName,lastName);
        //  }
        return employeeService.find(firstName, lastName);
    }
    @GetMapping("/workers")
    public Map<String , Employee> workers () {
        return employeeService.workerks();
    }
}

