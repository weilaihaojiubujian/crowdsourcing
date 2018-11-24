package com.Entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: wanghongbin
 * @Description:
 * @Date: Create in 14:01 2018/11/8
 */
public class Personinformation {

    private int id;

    private int uid;//用户的序号

    private String name;

    private String sex;

    private String city;


    private Date birthday;

    private String idcard;//身份证号

    private double evaluation;//评价


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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date rel_birth = format.parse(birthday);

        this.birthday = rel_birth;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public double getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(double evaluation) {
        this.evaluation = evaluation;
    }

    @Override
    public String toString() {
        return "Personinformation{" +
                "id=" + id +
                ", uid=" + uid +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", city='" + city + '\'' +
                ", birthday=" + birthday +
                ", idcard='" + idcard + '\'' +
                ", evaluation=" + evaluation +
                '}';
    }
}
