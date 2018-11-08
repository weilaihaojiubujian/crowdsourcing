package com.Entity;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 14:00 2018/11/8
 */
public class Pricingmodel {

    private int id;

    private String name;//计费方式名

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pricingmodel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
