package ph.service;

import ph.pojos.Team;

import java.io.Serializable;

/**
 * Created by leon on 24/01/2017.
 */
public interface ITeamService extends Serializable {
    void save(Team team);
}
