package ph.service;

import ph.doa.IEmployeeDao;
import ph.pojos.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by leon1a on 19/01/17.
 */
@Service
public class EmployeeService implements IEmployeeService{

    @Autowired
    IEmployeeDao employeeDao;

    @Override
    public void save(Employee employee) {
        employeeDao.save(employee);
    }

}
