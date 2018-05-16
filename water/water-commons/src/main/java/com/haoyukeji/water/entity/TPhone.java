package com.haoyukeji.water.entity;

import java.io.Serializable;

/**
 * @author 
 */
public class TPhone implements Serializable {
    private Integer id;

    private String name;

    private Long phone;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}