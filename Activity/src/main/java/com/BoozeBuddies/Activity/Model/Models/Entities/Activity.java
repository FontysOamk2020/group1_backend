package com.BoozeBuddies.Activity.Model.Models.Entities;

import javax.persistence.*;
import java.util.Date;

@Entity()
@Table(name = "activity")
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, updatable = false)
    private int id;

    @Column(name = "timeEnteredBar", nullable = false)
    private java.util.Date timeEnteredBar;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @MapsId("user_id")
    private User user;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @MapsId("bar_id")
    private Bar bar;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getTimeEnteredBar() {
        return timeEnteredBar;
    }

    public void setTimeEnteredBar(Date timeEnteredBar) {
        this.timeEnteredBar = timeEnteredBar;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Bar getBar() {
        return bar;
    }

    public void setBar(Bar bar) {
        this.bar = bar;
    }
}
