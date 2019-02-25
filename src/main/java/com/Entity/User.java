package com.Entity;

import java.util.List;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 12:55 2018/11/8
 */
public class User {

    private int id;//序号

    private String username;//用户名

    private String password;//密码

    private String phonenumber;//手机号

    private int state;//状态

    private String species;//是商家还是个人

    private double money;//拥有的金额

    private String email;

    private String code;

    private List<BankAccount> accountList;


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

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public List<BankAccount> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<BankAccount> accountList) {
        this.accountList = accountList;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", state=" + state +
                ", species='" + species + '\'' +
                ", money=" + money +
                ", email='" + email + '\'' +
                ", code='" + code + '\'' +
                ", accountList=" + accountList +
                '}';
    }
}
