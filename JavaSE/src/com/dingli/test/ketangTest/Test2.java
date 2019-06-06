package com.dingli.test.ketangTest;

/**
 * String s = "113@ ere qqq yyui"
 请输出所有子串
 113
 ere
 qqq
 yyui

 */
public class Test2 {
    public static void main(String[] args){
        String s = "133@ ere qqq yyui";
        String[] strArr = s.split(" ");
        for(String str : strArr){
            System.out.println(str.replaceAll("@",""));
        }
    }
}
