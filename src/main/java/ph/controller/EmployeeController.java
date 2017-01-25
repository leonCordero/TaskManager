package ph.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by leon on 24/01/2017.
 */
@Controller
public class EmployeeController {

    @RequestMapping(value = "/employees")
    public ModelAndView employees(ModelAndView modelAndView){
        modelAndView.setViewName("content/employees");
        return modelAndView;
    }
}
