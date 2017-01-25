package ph.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ph.doa.ITeamDao;
import ph.models.Team;

import java.util.List;

/**
 * Created by leon on 24/01/2017.
 */
@Service
public class TeamService implements ITeamService {

    @Autowired
    ITeamDao teamDao;

    @Override
    public void save(Team team) {
        teamDao.save(team);
    }

    @Override
    public List<Team> getAllTeams() {
        return teamDao.findAll();
    }

    public Team findTeamByName(String teamName){
        return teamDao.findTeamByName(teamName);
    }
}
