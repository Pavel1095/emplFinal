package skypro.employeeBook.controller;

import org.springframework.web.bind.annotation.*;
import skypro.employeeBook.dto.Employee;
import skypro.employeeBook.service.EmployeeService;

import java.util.Collection;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/add")
    public Employee addEmployee(@RequestParam String firstName, @RequestParam String lastName, @RequestParam int department,@RequestParam double salary ){
        return employeeService.addEmployee(firstName, lastName, department, salary);
    }

    @GetMapping("/remove")
    public Employee removeEmployee(@RequestParam String firstName, @RequestParam String lastName) {
        return employeeService.remoteEmployee(firstName, lastName);
    }

    @GetMapping("/find")
    public Employee findEmployee(@RequestParam String firstName, @RequestParam String lastName) {
        return employeeService.getEmployee(firstName, lastName);
    }

    @GetMapping
    public Collection<Employee> findAll(){
        return employeeService.findAll();
    }
}
