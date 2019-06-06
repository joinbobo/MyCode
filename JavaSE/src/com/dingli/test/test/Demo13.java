package com.dingli.test.test;

import java.util.Scanner;

/**
 * 13.	输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
 * 程序分析：利用while语句,条件为输入的字符不为'\n'.
 */
public class Demo13 {

    public static void main(String[] args) {
        int shuzi = 0;
        int kongge = 0;
        int yingwen = 0;
        int qita = 0;

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n"); //匹配模式改为换行 默认是空格
        String a =sc.nextLine();
        char[] ar = a.toCharArray();
        for(int i=0; i<ar.length; i++){
            if(Character.isDigit(ar[i])){ //isDigit 判断数字
                shuzi++;
            }else if(Character.isSpaceChar(ar[i])){ //isSpaceChar 判断空格
                kongge++;
            }else if(Character.isLetter(ar[i])){ // isLetter 判断字母
                yingwen++;
            }else{
                qita++;
            }
        }
        System.out.println("字母个数"+yingwen);
        System.out.println("空格个数"+kongge);
        System.out.println("数字个数"+shuzi);
        System.out.println("其他个数"+qita);


    }
}
