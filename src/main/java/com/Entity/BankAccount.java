package com.Entity;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 13:55 2018/11/8
 */
public class BankAccount {

    private int id;
    private String uid;
    private String account;//卡号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", uid='" + uid + '\'' +
                ", account='" + account + '\'' +
                '}';
    }
}
