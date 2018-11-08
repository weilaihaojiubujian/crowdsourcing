package com.Entity;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 14:19 2018/11/8
 */
public class Taskmessage {

    private int id;

    private int uid;//用户的序号

    private int ttid;//任务种类的序号

    private int pmid;//计费模式的序号

    private String name;

    private String message;

    private int state;//状态

    private String startingaddress;//起始附近坐标

    private String startingdetail;//起始详细地址

    private String startinggeohash;//用于查找附近订单的hash码

    private double weight;

    private String purposeaddress;//目的附近坐标

    private String purposedetail;//目的详细地址

    private String purposegeohash;//用于查找附近订单的hash码

    //起始经度
    private Double startinglocationX;
    //起始纬度
    private Double startinglocationY;

    //目的经度
    private Double purposelocationX;
    //目的纬度
    private Double purposelocationY;

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

    public int getTtid() {
        return ttid;
    }

    public void setTtid(int ttid) {
        this.ttid = ttid;
    }

    public int getPmid() {
        return pmid;
    }

    public void setPmid(int pmid) {
        this.pmid = pmid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStartingaddress() {
        return startingaddress;
    }

    public void setStartingaddress(String startingaddress) {
        this.startingaddress = startingaddress;
    }

    public String getStartingdetail() {
        return startingdetail;
    }

    public void setStartingdetail(String startingdetail) {
        this.startingdetail = startingdetail;
    }

    public String getStartinggeohash() {
        return startinggeohash;
    }

    public void setStartinggeohash(String startinggeohash) {
        this.startinggeohash = startinggeohash;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getPurposeaddress() {
        return purposeaddress;
    }

    public void setPurposeaddress(String purposeaddress) {
        this.purposeaddress = purposeaddress;
    }

    public String getPurposedetail() {
        return purposedetail;
    }

    public void setPurposedetail(String purposedetail) {
        this.purposedetail = purposedetail;
    }

    public String getPurposegeohash() {
        return purposegeohash;
    }

    public void setPurposegeohash(String purposegeohash) {
        this.purposegeohash = purposegeohash;
    }

    public Double getStartinglocationX() {
        return startinglocationX;
    }

    public void setStartinglocationX(Double startinglocationX) {
        this.startinglocationX = startinglocationX;
    }

    public Double getStartinglocationY() {
        return startinglocationY;
    }

    public void setStartinglocationY(Double startinglocationY) {
        this.startinglocationY = startinglocationY;
    }

    public Double getPurposelocationX() {
        return purposelocationX;
    }

    public void setPurposelocationX(Double purposelocationX) {
        this.purposelocationX = purposelocationX;
    }

    public Double getPurposelocationY() {
        return purposelocationY;
    }

    public void setPurposelocationY(Double purposelocationY) {
        this.purposelocationY = purposelocationY;
    }

    @Override
    public String toString() {
        return "Taskmessage{" +
                "id=" + id +
                ", uid=" + uid +
                ", ttid=" + ttid +
                ", pmid=" + pmid +
                ", name='" + name + '\'' +
                ", message='" + message + '\'' +
                ", state=" + state +
                ", startingaddress='" + startingaddress + '\'' +
                ", startingdetail='" + startingdetail + '\'' +
                ", startinggeohash='" + startinggeohash + '\'' +
                ", weight=" + weight +
                ", purposeaddress='" + purposeaddress + '\'' +
                ", purposedetail='" + purposedetail + '\'' +
                ", purposegeohash='" + purposegeohash + '\'' +
                ", startinglocationX=" + startinglocationX +
                ", startinglocationY=" + startinglocationY +
                ", purposelocationX=" + purposelocationX +
                ", purposelocationY=" + purposelocationY +
                '}';
    }
}
