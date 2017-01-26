package ph.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ph.doa.IEmployeeDao;
import ph.models.Employee;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by leon1a on 19/01/17.
 */
@Service
public class EmployeeService implements IEmployeeService{

    @Autowired
    IEmployeeDao employeeDao;

    @Override
    @Transactional
    public void save(Employee employee) {
        employeeDao.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeDao.findAll();
    }

    @Override
    public Employee findEmployeeById(long id) {
        return employeeDao.findOne(id);
    }

}
