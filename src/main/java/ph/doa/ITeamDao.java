package ph.doa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ph.models.Team;

import javax.transaction.Transactional;

/**
 * Created by leon on 24/01/2017.
 */
@Transactional
public interface ITeamDao extends JpaRepository<Team, Long> {

    @Query(value = "select * from team where name = :name", nativeQuery = true)
    Team findTeamByName(@Param("name") String name);
}
