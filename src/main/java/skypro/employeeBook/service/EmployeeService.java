package skypro.employeeBook.service;

import skypro.employeeBook.dto.Employee;

import java.util.Collection;
import java.util.List;

public interface EmployeeService {
    Employee addEmployee(String firstName, String lastName, int department, double salary);

    Employee remoteEmployee(String firstName, String lastName);

    Employee getEmployee(String firstName, String lastName);

    Employee remoteEmployee(String firstName, String lastName, int department, double salary);

    Employee getEmployee(String firstName, String lastName, int department, double salary);

    List<Employee> findAll();
}
