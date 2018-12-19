package com.Dto;

import java.sql.Timestamp;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 13:32 2018/12/19
 */
public class TransferandFlow {

    private String id;//序号

    private int uidone;//支付用户序号

    private String uidonename;

    private int uidtwo;//收到序号

    private String uidtwoname;

    private int state;//是否支付

    private double price;//价格

    private String fid;

    private String flownum;

    private double paidamount;

    private Integer paidmethod;

    private Timestamp createtime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getUidone() {
        return uidone;
    }

    public void setUidone(int uidone) {
        this.uidone = uidone;
    }

    public int getUidtwo() {
        return uidtwo;
    }

    public void setUidtwo(int uidtwo) {
        this.uidtwo = uidtwo;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public String getFlownum() {
        return flownum;
    }

    public void setFlownum(String flownum) {
        this.flownum = flownum;
    }

    public double getPaidamount() {
        return paidamount;
    }

    public void setPaidamount(double paidamount) {
        this.paidamount = paidamount;
    }

    public Integer getPaidmethod() {
        return paidmethod;
    }

    public void setPaidmethod(Integer paidmethod) {
        this.paidmethod = paidmethod;
    }

    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    public String getUidonename() {
        return uidonename;
    }

    public void setUidonename(String uidonename) {
        this.uidonename = uidonename;
    }

    public String getUidtwoname() {
        return uidtwoname;
    }

    public void setUidtwoname(String uidtwoname) {
        this.uidtwoname = uidtwoname;
    }

    @Override
    public String toString() {
        return "TransferandFlow{" +
                "id='" + id + '\'' +
                ", uidone=" + uidone +
                ", uidonename='" + uidonename + '\'' +
                ", uidtwo=" + uidtwo +
                ", uidtwoname='" + uidtwoname + '\'' +
                ", state=" + state +
                ", price=" + price +
                ", fid='" + fid + '\'' +
                ", flownum='" + flownum + '\'' +
                ", paidamount=" + paidamount +
                ", paidmethod=" + paidmethod +
                ", createtime=" + createtime +
                '}';
    }
}
