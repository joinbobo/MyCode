package com.dingli.test.object;

//每个原生数据类型都有对应的包装类
public class IntegerDemo {
    public static void main(String[] args){
        int x = 0;
        Integer y = new Integer(0);
        System.out.println(x == y);

        //直接new 创建了两个 integer 对象 地址不同

        Integer a = 100;
        Integer b = 100;
        //常量定义，自动装箱,隐式调用了 valueOf 方法
        //valueOf 方法有一个缓存区 [-128,127]
        //当我们定义的数在此区域内，引用的是缓存的地址
        //如果值相等，引用的是同一个地址，所以返回true
        //超过这个范围，等同于 new Integer
        System.out.println(a == b); //true

        Integer m = 200;
        Integer n = 200;
        System.out.println(m == n); //false

        //"12"
        int k = Integer.valueOf("12");
        System.out.println(k+1);
        //我们用int接收了一个Integer对象，这就叫自动拆箱


        Double aa = 18.0;
        Double bb = 18.0;
        Float cc = 18.0F;
        System.out.println(aa == bb);   //浮点型

    }
}
