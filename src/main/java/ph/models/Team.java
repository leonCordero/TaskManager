package ph.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by leon1a on 19/01/17.
 */
@Entity
@Table(name = "team")
public class Team implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "team_id")
    private long id;

    @Column(nullable = false)
    private String name;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "teams")
    private List<Employee> employees;

    public Team(String name) {
        this.name = name;
    }

    public Team(String name, List<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

    public Team() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
