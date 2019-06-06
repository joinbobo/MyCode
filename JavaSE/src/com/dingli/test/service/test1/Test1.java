package com.dingli.test.service.test1;

public class Test1 extends Base {

    public static void main(String[] args) {
        /**
         * 创建手机对象
         */
        Iphone p1 = new Iphone();
        p1.setId("001");
        p1.setName("荣耀");
        p1.setDate("2019.3.1");
        p1.setBrand("华为");
        p1.setColor("红色");
        p1.setPrice(999);
        System.out.println(p1);

        /**
         * 创建衣服对象
         */
        Clothes clothes = new Clothes();
        clothes.setId("002");
        clothes.setName("阿迪达斯");
        clothes.setDate("2019.3.1");
        clothes.setColor("黑色");
        clothes.setSize(30);
        clothes.setPrice(199);
        System.out.println(clothes);

        /**
         * 创建汽车对象
         */
        Car car = new Car();
        car.setId("川A66666");
        car.setBrand("五菱宏光");
        car.setModel("S经典款");
        car.setDate("2018年");
        System.out.println(car);
    }
}
