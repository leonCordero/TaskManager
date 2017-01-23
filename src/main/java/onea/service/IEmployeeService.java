package onea.service;

import onea.pojos.Employee;

import java.io.Serializable;

/**
 * Created by leon1a on 19/01/17.
 */
public interface IEmployeeService extends Serializable {
    void save(Employee employee);

}
