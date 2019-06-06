package com.dingli.test.design;

public interface Count {
    //count 方法的参数就是我们的策略

    /**
     * 该方法为计算结果
     * @param price 原价
     * @return
     */
    double count(double price);
}
