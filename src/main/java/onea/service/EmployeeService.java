package onea.service;

import onea.doa.IEmployeeDao;
import onea.pojos.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
