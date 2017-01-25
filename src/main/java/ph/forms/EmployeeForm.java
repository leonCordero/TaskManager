package ph.forms;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by leon on 24/01/2017.
 */
public class EmployeeForm implements Serializable {
    private static final long serialVersionUI = 1L;

    @NotNull
    String name;

    @NotNull
    String Position;

    @NotNull
    String teams;

    public EmployeeForm() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public String getTeams() {
        return teams;
    }

    public void setTeams(String teams) {
        this.teams = teams;
    }
}
