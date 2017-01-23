package onea.ui;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import onea.componets.TaskComponent;
import onea.service.EmployeeService;
import onea.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by leon1a on 18/01/17.
 */
@SpringUI
@Theme("dashboard")
public class HomeUI extends UI{

    @Autowired
    EmployeeService employeeService;

    @Autowired
    TaskService taskService;

    @Autowired
    TaskComponent taskComponent;

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        setContent(new Label("Hello World"));
    }
}
