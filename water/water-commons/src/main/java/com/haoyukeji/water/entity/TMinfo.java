package com.haoyukeji.water.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class TMinfo implements Serializable {
    private Integer mid;

    private Integer a;

    private Double waternumber;

    private Double eletricnumber;

    private Double watermoney;

    private Double eletricmoney;

    private Date enddate;

    private static final long serialVersionUID = 1L;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Double getWaternumber() {
        return waternumber;
    }

    public void setWaternumber(Double waternumber) {
        this.waternumber = waternumber;
    }

    public Double getEletricnumber() {
        return eletricnumber;
    }

    public void setEletricnumber(Double eletricnumber) {
        this.eletricnumber = eletricnumber;
    }

    public Double getWatermoney() {
        return watermoney;
    }

    public void setWatermoney(Double watermoney) {
        this.watermoney = watermoney;
    }

    public Double getEletricmoney() {
        return eletricmoney;
    }

    public void setEletricmoney(Double eletricmoney) {
        this.eletricmoney = eletricmoney;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }
}