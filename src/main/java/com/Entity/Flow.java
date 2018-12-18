package com.Entity;

import java.sql.Timestamp;

public class Flow {
    private String id;

    private String flownum;



    private String   tfid;

    private double paidamount;

    private Integer paidmethod;

    private Timestamp createtime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFlownum() {
        return flownum;
    }

    public void setFlownum(String flownum) {
        this.flownum = flownum;
    }

    public String getTfid() {
        return tfid;
    }

    public void setTfid(String tfid) {
        this.tfid = tfid;
    }

    public double getPaidamount() {
        return paidamount;
    }


    public void setPaidamount(double paidamount) {
        this.paidamount = paidamount;
    }

    public Timestamp getCreatetime() {
        return createtime;
    }

    public Integer getPaidmethod() {
        return paidmethod;
    }

    public void setPaidmethod(Integer paidmethod) {
        this.paidmethod = paidmethod;
    }



    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }
}