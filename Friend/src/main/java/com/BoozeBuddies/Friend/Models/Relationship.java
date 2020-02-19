package com.BoozeBuddies.Friend.Models;

import com.BoozeBuddies.Friend.Models.Enums.FriendStatus;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Friend")
public class Relationship
{
    @Id
    @Column(name = "id", unique = true)
    private int id;
    @Column(name = "userOneId")
    private int friendOneId;
    @Column(name = "userTwoId")
    private int friendTwoId;
    @Column(name = "status")
    private FriendStatus friendStatus;

    public Relationship(){}

    public Relationship(int friendOneId, int friendTwoId, FriendStatus friendStatus)
    {
        this.friendOneId = friendOneId;
        this.friendTwoId = friendTwoId;
        this.friendStatus = friendStatus;
    }

    public int getFriendOneId()
    {
        return friendOneId;
    }

    public void setFriendOneId(int friendOneId)
    {
        this.friendOneId = friendOneId;
    }

    public int getFriendTwoId()
    {
        return friendTwoId;
    }

    public void setFriendTwoId(int friendTwoId)
    {
        this.friendTwoId = friendTwoId;
    }

    public FriendStatus getFriendStatus()
    {
        return friendStatus;
    }

    public void setFriendStatus(FriendStatus friendStatus)
    {
        this.friendStatus = friendStatus;
    }
}
