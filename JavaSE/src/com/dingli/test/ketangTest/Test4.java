package com.dingli.test.ketangTest;

/**
 * 编写一个程序，将下面的一段文本中的各个单词的字母顺序翻转，
 “To be or not to be"，将变成"oT eb ro ton ot eb."。

 */
public class Test4 {
    public static void main(String[] args){
        String s = "To be or not to be";

        String[] strArr = s.split(" ");

        StringBuilder sb = null;
        StringBuilder sb1 = new StringBuilder();
        for(String str : strArr){
            sb = new StringBuilder(str);
            sb1.append(sb.reverse()).append(" ");
        }
        System.out.println(sb1);
    }
}
