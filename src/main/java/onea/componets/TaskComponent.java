package onea.componets;

import com.vaadin.ui.VerticalLayout;
import onea.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by leon1a on 19/01/17.
 */
@Component
public class TaskComponent extends VerticalLayout{

    @Autowired
    EmployeeService employeeService;

    @PostConstruct
    void init(){
        setSpacing(true);

    }
}
