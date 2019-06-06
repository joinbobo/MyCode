package com.dingli.test.io;

import java.io.Serializable;


public class Place1 implements Serializable{
    private String pro;
    private String city;
    private String county;

    public Place1() {
    }

    public Place1(String pro, String city, String county) {
        this.pro = pro;
        this.city = city;
        this.county = county;
    }

    public String getPro() {
        return pro;
    }

    public void setPro(String pro) {
        this.pro = pro;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Place{" +
                "pro='" + pro + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                '}';
    }
}
