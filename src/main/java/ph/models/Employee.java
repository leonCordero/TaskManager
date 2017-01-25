package ph.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon1a on 18/01/17.
 */

@Entity
@Table(name = "employee")
public class Employee implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "employee_id")
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String position;

    @OneToMany(targetEntity = Task.class, mappedBy = "employee", cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private List<Task> tasks;

    @ManyToMany(targetEntity =Team.class, cascade = {CascadeType.ALL},
            fetch = FetchType.LAZY)
    @JoinTable(name = "employee_team", joinColumns = {
            @JoinColumn(name = "employee_id", referencedColumnName = "employee_id")},
            inverseJoinColumns = {@JoinColumn(name = "team_id", referencedColumnName = "team_id")})
    private List<Team> teams = new ArrayList<Team>();

    public Employee(String name, List<Task> tasks, List<Team> teams) {
        this.name = name;
        this.tasks = tasks;
        this.teams = teams;
    }

    public Employee() {
    }

    public Employee(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }
}
