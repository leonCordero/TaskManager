package ph.service;

import ph.pojos.Task;

import java.io.Serializable;

/**
 * Created by leon1a on 19/01/17.
 */
public interface ITaskService extends Serializable {

    void save(Task task);
}
