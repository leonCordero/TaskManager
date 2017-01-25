package ph.service;

import ph.models.Team;

import java.io.Serializable;
import java.util.List;

/**
 * Created by leon on 24/01/2017.
 */
public interface ITeamService extends Serializable {
    void save(Team team);
    List<Team> getAllTeams();
}
