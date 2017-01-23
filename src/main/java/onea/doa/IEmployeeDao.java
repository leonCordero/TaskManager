package onea.doa;

import onea.pojos.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

/**
 * Created by leon1a on 18/01/17.
 */
@Transactional
public interface IEmployeeDao extends JpaRepository<Employee, Long>{

}
