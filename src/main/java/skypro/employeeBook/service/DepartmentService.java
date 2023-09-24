package skypro.employeeBook.service;

import org.springframework.stereotype.Service;
import skypro.employeeBook.dto.Employee;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@Service
public interface DepartmentService {

    Employee maxSalaryEmployee(int department);

    Employee minSalaryEmployee(int department);

    Collection<Employee> getEmployeesInDepartment(int department);

    Map<Integer, List<Employee>> getAll();
}
