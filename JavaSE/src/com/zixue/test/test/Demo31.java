package com.zixue.test.test;

import javax.swing.*;

public class Demo31 {
    //*********Found**********
    public static void main( String args[] ){
        PackageData d = new PackageData();
        String output;
        output = "实例化后:\n" + d.toString();
        d.x = 77;          //修改包访问的数据
//*********Found**********
        d.s = "祝您成功!";  //修改包访问的数据
        output += "\n修改数据后的访问结果:\n" + d.toString();
//*********Found**********
        JOptionPane.showMessageDialog( null, output,
                "对包的访问示范",
                JOptionPane.INFORMATION_MESSAGE );
        System.exit( 0 );
    }
}

class PackageData {
    int x;     //访问包的实例变量
    String s;  //访问包的实例变量
    //构造方法
    public PackageData(){
        x = 0;
        s = "Hello";
    }
    public String toString(){
        return "x: " + x + "    s: " + s;
    }
}
