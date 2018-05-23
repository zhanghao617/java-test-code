package com.haoyukeji.water.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class TWinfo implements Serializable {
    private Integer wid;

    /**
     * 水费
     */
    private Double wprice;

    /**
     * 电费
     */
    private Double eprice;

    /**
     * 开始时间
     */
    private Date startdate;

    /**
     * 结束时间
     */
    private Date enddate;

    private static final long serialVersionUID = 1L;

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public Double getWprice() {
        return wprice;
    }

    public void setWprice(Double wprice) {
        this.wprice = wprice;
    }

    public Double getEprice() {
        return eprice;
    }

    public void setEprice(Double eprice) {
        this.eprice = eprice;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }
}