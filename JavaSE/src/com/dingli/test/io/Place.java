package com.dingli.test.io;

import java.util.Objects;

public class Place implements Cloneable{
    private String pro;
    private String city;
    private String county;

    public Place() {
    }

    public Place(String pro, String city, String county) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Place place = (Place) o;
        return Objects.equals(pro, place.pro) &&
                Objects.equals(city, place.city) &&
                Objects.equals(county, place.county);
    }

    @Override
    public int hashCode() {

        return Objects.hash(pro, city, county);
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
