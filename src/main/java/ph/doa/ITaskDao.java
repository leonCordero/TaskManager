package ph.doa;

import ph.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

/**
 * Created by leon1a on 19/01/17.
 */
@Transactional
public interface ITaskDao extends JpaRepository<Task, Long> {
}
