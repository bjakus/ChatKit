package com.stfalcon.chatkit.sample.common.data.model;

import com.stfalcon.chatkit.commons.models.IUser;

import java.io.File;

/*
 * Created by troy379 on 04.04.17.
 */
public class User implements IUser {

    private Integer id;
    private String name;
    private String avatar;
    private boolean online;

    public User(Integer id, String name, String avatar, boolean online) {
        this.id = id;
        this.name = name;
        this.avatar = avatar;
        this.online = online;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getUserImage() {
        return avatar;
    }

    public boolean isOnline() {
        return online;
    }
}
