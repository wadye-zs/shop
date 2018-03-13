package com.shop.beans;

import java.util.Date;

public class AdminAccount {

    //ID
    private int id;

    //username
    private String username;

    //password
    private String password;

    //dt_create
    private Date dt_create;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDt_create() {
        return dt_create;
    }

    public void setDt_create(Date dt_create) {
        this.dt_create = dt_create;
    }

    @Override
    public String toString() {
        return "AdminAccount{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", dt_create=" + dt_create +
                '}';
    }
}
