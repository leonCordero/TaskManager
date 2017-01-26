package ph.service;

import ph.models.Employee;

import java.io.Serializable;
import java.util.List;

/**
 * Created by leon1a on 19/01/17.
 */
public interface IEmployeeService extends Serializable {
    void save(Employee employee);
    List<Employee> getAllEmployees();
    Employee findEmployeeById(long id);
}
