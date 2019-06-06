package com.dingli.test.service.test1;

public class Iphone extends Base {
    /**
     * 手机属性
     */
    private String name; //名称
    private String color; //颜色
    private String brand; //品牌
    private int price; //价格

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "编号='"+ getId() + '\'' +
                ", 名称='" + name + '\'' +
                ", 生产日期='" + getDate() + '\'' +
                ", 颜色='" + color + '\'' +
                ", 品牌='" + brand + '\'' +
                ", 价格=" + price +
                '}';
    }
}
