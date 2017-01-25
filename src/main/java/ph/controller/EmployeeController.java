package ph.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import ph.forms.EmployeeForm;
import ph.models.Employee;
import ph.models.Team;
import ph.service.EmployeeService;
import ph.service.TeamService;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by leon on 24/01/2017.
 */
@Controller
public class EmployeeController {

    @Autowired
    TeamService teamService;

    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public ModelAndView employees(@ModelAttribute("employeeForm")EmployeeForm employeeForm, ModelAndView modelAndView){
        modelAndView.addObject("employeeForm", employeeForm);
        modelAndView.addObject("teams", teamService.getAllTeams());
        modelAndView.setViewName("content/employees");
        return modelAndView;
    }

    @RequestMapping(value = "/save-employee", method = RequestMethod.POST)
    public ModelAndView saveEmployee(@Valid @ModelAttribute("employeeForm")EmployeeForm employeeForm,
                                     ModelAndView modelAndView){
        Employee employee = new Employee();
        employee.setName(employeeForm.getName());
        employee.setPosition(employeeForm.getPosition());
        employee.setTeams(getTeams(employeeForm.getTeams()));
        employeeService.save(employee);
        return new ModelAndView(new RedirectView("/employees", true));
    }

    private List<Team> getTeams(String teams) {
        List<String> teamsList = Arrays.asList(teams.split(","));
        List<Team> teamsComplete = new LinkedList<Team>();
        teamsList.forEach(team -> teamsComplete.add(new Team(team)));
        return teamsComplete;
    }
}
