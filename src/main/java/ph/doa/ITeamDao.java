package ph.doa;

import org.springframework.data.jpa.repository.JpaRepository;
import ph.pojos.Team;

import javax.transaction.Transactional;

/**
 * Created by leon on 24/01/2017.
 */
@Transactional
public interface ITeamDao extends JpaRepository<Team, Long> {
}
