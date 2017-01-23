package onea.service;

import onea.doa.ITaskDao;
import onea.pojos.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by leon1a on 19/01/17.
 */
@Service
public class TaskService implements ITaskService {

    @Autowired
    ITaskDao taskDao;

    @Override
    public void save(Task task) {
        taskDao.save(task);
    }
}
