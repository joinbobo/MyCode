package com.dingli.test.service.test1;

public class Car extends Base {
    /**
     * 汽车属性
     */
    private String brand;//品牌
    private String model;//型号

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "车牌号='" + getId() + '\'' +
                ", 品牌='" + brand + '\'' +
                ", 型号='" + model + '\'' +
                ", 出厂时间='" + getDate() + '\'' +
                '}';
    }
}
