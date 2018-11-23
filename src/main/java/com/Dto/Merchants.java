package com.Dto;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 19:37 2018/11/23
 */
public class Merchants {
    //商家信息

    private int id;//序号

    private String username;//用户名

    private String password;//密码

    private String phonenumber;//手机号

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
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
        return "Merchants{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", headname='" + headname + '\'' +
                ", headidcard='" + headidcard + '\'' +
                '}';
    }
}
