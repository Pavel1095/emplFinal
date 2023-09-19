package skypro.employeeBook.service;

import org.springframework.stereotype.Service;
import skypro.employeeBook.dto.Employee;
import skypro.employeeBook.dto.exception.EmployeeAlreadyAddedException;
import skypro.employeeBook.dto.exception.EmployeeNotFoundException;
import skypro.employeeBook.dto.exception.EmployeeStorageIsFullException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private List<Employee> employeeMap;

    private static final int EMPLOYEE_SIZE = 3;

    public EmployeeServiceImpl() {
        this.employeeMap = (List<Employee>) new HashMap<>();
    }

    @Override
    public Employee addEmployee(String firstName, String lastName, int department, double salary) {

        if (employeeMap.size() == EMPLOYEE_SIZE)
            throw new EmployeeStorageIsFullException();

        Employee employee = new Employee(firstName, lastName, department, salary);

        if(employeeMap.contains(employee)) {
            throw new EmployeeAlreadyAddedException();
        }

        employeeMap.add(employee);

        return employee;
    }

    @Override
    public Employee remoteEmployee(String firstName, String lastName) {
        return null;
    }

    @Override
    public Employee getEmployee(String firstName, String lastName) {
        return null;
    }

    @Override
    public Employee remoteEmployee(String firstName, String lastName, int department, double salary) {
        Employee employee = new Employee(firstName, lastName, department, salary);
        if (!employeeMap.remove(employee)) {
            throw new EmployeeNotFoundException();
        }
        return employee;
    }

    @Override
    public Employee getEmployee(String firstName, String lastName, int department, double salary) {
        Employee employee = new Employee(firstName, lastName, department, salary);
        if (!employeeMap.contains(employee)){
            throw new EmployeeNotFoundException();
        }
        return employee;
    }

    @Override
    public List<Employee> findAll(){
        return employeeMap;
    }
}
