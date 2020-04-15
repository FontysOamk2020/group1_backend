package com.BoozeBuddies.Activity.Model.Models.Entities;

import com.BoozeBuddies.Activity.Model.Models.Entities.enums.FriendStatus;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "Friend")
public class Friend implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private int id;

    @ManyToOne()
    @JoinColumn(name = "userOneId", referencedColumnName = "id")
    private User userOneId;

    @ManyToOne()
    @JoinColumn(name = "userTwoId", referencedColumnName = "id")
    private User userTwoId;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "status")
    private FriendStatus Status;

    public Friend(){}

    public Friend(int id, User friendOneId, User friendTwoId, FriendStatus friendStatus)
    {
        this.id = id;
        this.userOneId = friendOneId;
        this.userTwoId = friendTwoId;
        this.Status = friendStatus;
    }


    public User getUserTwoId()
    {
        return userTwoId;
    }

    public void setUserTwoId(User userTwoId)
    {
        this.userTwoId = userTwoId;
    }

    public FriendStatus getStatus()
    {
        return Status;
    }

    public void setStatus(FriendStatus status)
    {
        this.Status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUserOneId() {
        return userOneId;
    }

    public void setUserOneId(User userOneId) {
        this.userOneId = userOneId;
    }
}
