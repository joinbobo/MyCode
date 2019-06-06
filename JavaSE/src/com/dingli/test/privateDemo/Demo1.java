package com.dingli.test.privateDemo;

/**
 *  修饰符     类   包   子类  其他包
 *  public     +    +     +     +
 *  protected  +    +     +     -
 *  default    +    +     -     -
 *  private    +    -     -     -
 */
public class Demo1 {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;

        try{
            System.out.println(x / y);
        }catch(Exception e){
            System.out.println("出错后执行");
            e.printStackTrace();
        }finally{
            System.out.println("必执行的代码块");
        }
        System.out.println("-------------------");
    }



}
