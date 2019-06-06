package com.dingli.test.ketangTest;

/**
 * 写一个方法判断一个字符串是否对称
 */
public class Test1 {
    public static void main(String[] args){
        String str = "abcba";
        boolean rs = Test1.checkStr(str);
        System.out.println(rs);
    }

    public static boolean checkStr(String str){
        if(str == null || str.isEmpty()){
            return false;
        }
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString().equals(str);   //字符串反转
    }
}

