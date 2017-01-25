package ph.forms;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by leon on 24/01/2017.
 */
public class TeamForm implements Serializable {
    private static final long serialVersionUI = 1L;

    @NotNull
    String teamName;

    public TeamForm() {
    }

    public TeamForm(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
