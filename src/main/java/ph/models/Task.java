package ph.models;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by leon1a on 18/01/17.
 */
@Entity
@Table(name = "task")
public class Task implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String priority;

    @Column()
    private String ticketUrl;

    @ManyToOne(targetEntity = Employee.class, fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    public Task() {
    }

    public Task(long id) {
        this.id = id;
    }

    public Task(String name, String description, String priority, Employee employee, String ticketUrl) {
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.employee = employee;
        this.ticketUrl = ticketUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaskName() {
        return name;
    }

    public void setTaskName(String name) {
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

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTicketUrl() {
        return ticketUrl;
    }

    public void setTicketUrl(String ticketUrl) {
        this.ticketUrl = ticketUrl;
    }
}
