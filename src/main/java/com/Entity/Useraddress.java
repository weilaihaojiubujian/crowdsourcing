package com.Entity;

import java.sql.Timestamp;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 17:17 2018/11/16
 */
public class Useraddress {

    private int id;//序号

    private int uid;//用户的序号

    private String address;//附近坐标


    private String geohash;//用于查找附近订单的hash码

    //经度
    private Double locationX;
    //纬度
    private Double locationY;

    private Timestamp createtime;//用户定位时间

    private Double distance;

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    public String getGeohash() {
        return geohash;
    }

    public void setGeohash(String geohash) {
        this.geohash = geohash;
    }

    public Double getLocationX() {
        return locationX;
    }

    public void setLocationX(Double locationX) {
        this.locationX = locationX;
    }

    public Double getLocationY() {
        return locationY;
    }

    public void setLocationY(Double locationY) {
        this.locationY = locationY;
    }

    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "Useraddress{" +
                "id=" + id +
                ", uid=" + uid +
                ", address='" + address + '\'' +
                ", geohash='" + geohash + '\'' +
                ", locationX=" + locationX +
                ", locationY=" + locationY +
                ", createtime=" + createtime +
                ", distance=" + distance +
                '}';
    }
}
