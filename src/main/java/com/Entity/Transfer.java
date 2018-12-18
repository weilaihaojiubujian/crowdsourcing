package com.Entity;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 17:08 2018/12/9
 */
//转账记录表
public class Transfer {

    private String id;//序号

    private int uid_one;//支付用户序号

    private int uid_two;//收到序号

    private int state;//是否支付

    private double price;//价格

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getUid_one() {
        return uid_one;
    }

    public void setUid_one(int uid_one) {
        this.uid_one = uid_one;
    }

    public int getUid_two() {
        return uid_two;
    }

    public void setUid_two(int uid_two) {
        this.uid_two = uid_two;
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

    @Override
    public String toString() {
        return "Transfer{" +
                "id=" + id +
                ", uid_one=" + uid_one +
                ", uid_two=" + uid_two +
                ", state=" + state +
                ", price=" + price +
                '}';
    }
}
