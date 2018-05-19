package com.haoyukeji.entity;

import java.io.Serializable;

/**
 * @author 
 */
public class Movies implements Serializable {
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 导演
     */
    private String direct;

    /**
     * 上映时间
     */
    private String createTimeYear;

    /**
     * 发布时间
     */
    private String releaseTime;

    /**
     * 简介
     */
    private String doc;

    private static final long serialVersionUID = 1L;

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

    public String getDirect() {
        return direct;
    }

    public void setDirect(String direct) {
        this.direct = direct;
    }

    public String getCreateTimeYear() {
        return createTimeYear;
    }

    public void setCreateTimeYear(String createTimeYear) {
        this.createTimeYear = createTimeYear;
    }

    public String getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }
}