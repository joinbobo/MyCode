package com.dingli.test.exception;

public class Demo7 {
    public static void main(String[] args) {
        // AgeException 直接继承的Exception
        // 则默认认为是非运行时异常（检查异常）
        try {
            checkAge(-10);
        } catch (AgeException e) {
            e.printStackTrace();
        }
    }

    public static int checkAge(int age) throws AgeException{
        if(age < 0){
            throw new AgeException("年龄不能小于0");
        }
        return age;
    }
}
