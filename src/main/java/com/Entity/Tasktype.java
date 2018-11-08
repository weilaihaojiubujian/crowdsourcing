package com.Entity;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 13:58 2018/11/8
 */
public class Tasktype {

    private int id;

    private String name;//任务种类名


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
        return "Tasktype{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
