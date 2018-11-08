package com.Entity;

import java.sql.Timestamp;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 14:33 2018/11/8
 */
public class Task {

    private int id;

    private int uid;//用户的序号

    private int tmid;//任务具体信息的序号

    private Timestamp createtime;//任务被接受时间

    private Timestamp completetime;//完成时间

    private double price;//价格

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getTmid() {
        return tmid;
    }

    public void setTmid(int tmid) {
        this.tmid = tmid;
    }

    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    public Timestamp getCompletetime() {
        return completetime;
    }

    public void setCompletetime(Timestamp completetime) {
        this.completetime = completetime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", uid=" + uid +
                ", tmid=" + tmid +
                ", createtime=" + createtime +
                ", completetime=" + completetime +
                ", price=" + price +
                '}';
    }
}
