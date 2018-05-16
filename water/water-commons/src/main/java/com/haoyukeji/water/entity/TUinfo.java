package com.haoyukeji.water.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class TUinfo implements Serializable {
    private Integer username;

    private String password;

    private String name;

    private Long phone;

    private String address;

    private Date adddate;

    private static final long serialVersionUID = 1L;

    public Integer getUsername() {
        return username;
    }

    public void setUsername(Integer username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getAdddate() {
        return adddate;
    }

    public void setAdddate(Date adddate) {
        this.adddate = adddate;
    }
}