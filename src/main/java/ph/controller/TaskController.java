package ph.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import ph.forms.TaskForm;
import ph.models.Task;
import ph.service.EmployeeService;
import ph.service.TaskService;

/**
 * Created by leon on 25/01/2017.
 */
@Controller
public class TaskController {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    TaskService taskService;

    @RequestMapping(value = "/tasks", method = RequestMethod.GET)
    public ModelAndView tasks(final @ModelAttribute("taskForm") TaskForm taskForm, ModelAndView modelAndView){
        modelAndView.addObject("taskForm", taskForm);
        modelAndView.addObject("employees", employeeService.getAllEmployees());
        modelAndView.setViewName("content/tasks");
        return modelAndView;
    }

    @RequestMapping(value = "/save-task", method = RequestMethod.POST)
    public ModelAndView saveTask(final @ModelAttribute("taskForm") TaskForm taskForm, ModelAndView modelAndView){
        Task task = new Task();
        task.setName(taskForm.getName());
        task.setDescription(taskForm.getDescription());
        task.setPriority(taskForm.getPriority());
        task.setTicketUrl(taskForm.getTicketUrl());
        task.setEmployee(employeeService.findEmployeeById(Long.parseLong(taskForm.getEmployee())));
        taskService.save(task);
        return new ModelAndView(new RedirectView("/tasks", true));
    }
}
