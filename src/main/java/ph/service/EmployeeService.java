package ph.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ph.doa.IEmployeeDao;
import ph.models.Employee;

import javax.transaction.Transactional;

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

}
