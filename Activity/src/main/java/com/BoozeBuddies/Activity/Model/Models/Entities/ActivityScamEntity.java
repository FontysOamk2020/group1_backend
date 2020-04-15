package com.BoozeBuddies.Activity.Model.Models.Entities;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

@Entity(name = "ActivityScamEntity")
@Table(name = "activity")
public class ActivityScamEntity {

    @ApiModelProperty(hidden = true)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, updatable = false)
    private int id;

    @Column(name = "user_id")
    private int user_id;

    @Column(name = "bar_id")
    private int bar_id;

    public int getId() {
        return id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getBar_id() {
        return bar_id;
    }

    public void setBar_id(int bar_id) {
        this.bar_id = bar_id;
    }
}
