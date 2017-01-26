package ph.forms;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by leon on 25/01/2017.
 */
public class TaskForm implements Serializable {
    private static final long serialVersionUI = 1L;

    @NotNull
    String name;

    @NotNull
    String description;

    @NotNull
    String priority;

    @NotNull
    String ticketUrl;

    @NotNull
    String employee;

    public TaskForm() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getTicketUrl() {
        return ticketUrl;
    }

    public void setTicketUrl(String ticketUrl) {
        this.ticketUrl = ticketUrl;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }
}
