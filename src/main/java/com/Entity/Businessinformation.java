package com.Entity;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 14:10 2018/11/8
 */
public class Businessinformation {

    private int id;

    private int uid;//用户的序号

    private String name;

    private String address;

    private String headname;//负责人姓名

    private String headidcard;//负责人身份证号

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHeadname() {
        return headname;
    }

    public void setHeadname(String headname) {
        this.headname = headname;
    }

    public String getHeadidcard() {
        return headidcard;
    }

    public void setHeadidcard(String headidcard) {
        this.headidcard = headidcard;
    }

    @Override
    public String toString() {
        return "Businessinformation{" +
                "id=" + id +
                ", uid=" + uid +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", headname='" + headname + '\'' +
                ", headidcard='" + headidcard + '\'' +
                '}';
    }
}
