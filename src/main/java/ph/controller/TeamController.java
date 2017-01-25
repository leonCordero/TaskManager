package ph.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import ph.forms.TeamForm;
import ph.pojos.Team;
import ph.service.TeamService;

import javax.validation.Valid;

/**
 * Created by leon on 24/01/2017.
 */
@Controller
public class TeamController {

    @Autowired
    TeamService teamService;

    @RequestMapping(value = "/teams", method = RequestMethod.GET)
    public ModelAndView teams(final @ModelAttribute("teamForm") TeamForm teamForm, ModelAndView modelAndView){
        modelAndView.addObject("teamForm", teamForm);
        modelAndView.setViewName("content/teams");
        return modelAndView;
    }

    @RequestMapping(value = "/save-team", method = RequestMethod.POST)
    public ModelAndView saveTeam(@Valid @ModelAttribute("teamForm") TeamForm teamForm, ModelAndView modelAndView){
        Team team = new Team();
        team.setName(teamForm.getTeamName());
        teamService.save(team);
        return new ModelAndView(new RedirectView("/teams", true));
    }
}
