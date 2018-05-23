package com.haoyukeji.water.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author 
 */
public class TMinfo implements Serializable {
    private Integer id;

    private Integer aId;

    /**
     * 使用水的吨数
     */
    private Double waternumber;

    /**
     * 使用电的度数
     */
    private Double eletricnumber;

    /**
     * 剩余水费金额
     */
    private Double watermoney;

    /**
     * 剩余电费金额
     */
    private Double eletricmoney;

    /**
     * 报表截止日期
     */
    private Date enddate;

    private Account account;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
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

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}