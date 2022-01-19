package com.demo.model;

import javax.persistence.Table;
import java.io.Serializable;
@Table(name = "apusictest")
public class ApusicTest implements Serializable {

    private Integer id;

    private String username;

    private String userphone;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone;
    }
}