package com.dingli.test.service.test1;

public class Clothes extends Base {
    /**
     * 衣服属性
     */
    private String name; //名称
    private String color; //颜色
    private int size; //尺寸
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String
    toString() {
        return "Clothes{" +
                "货号='" + getId() + '\'' +
                ", 名称='" + name + '\'' +
                ", 生产日期='" + getDate() + '\'' +
                ", 颜色='" + color + '\'' +
                ", 尺寸=" + size +
                ", 价格=" + price +
                '}';
    }
}
