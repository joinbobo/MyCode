package com.zixue.test.test;

import javax.swing.*;

public class Demo21 {
    public static void main( String args[] ){
        //变量初始化
        int passes = 0,             //考生通过的数目
                failures = 0,           //考生不通过的数目
                student = 1,            //学生计数器
                result;                 //一门考生结果
        String input,               //用户输入的值
                output;              //输出字符串
        //处理10名学生,用计数器控制循环
        while ( student <= 10 ) {
            input = JOptionPane.showInputDialog(
                    "输入结果(1=通过,2=不通过)" );
//*********Found**********
            result = Integer.parseInt( input );
            if ( result == 1 )
                passes = passes + 1;
            else
                failures = failures + 1;
            student = student + 1;
        }
        //结果处理
        output = "通过: " + passes +
                "\n不通过: " + failures;
        if( passes > 8 )
            output = output + "\n提高学费";
//*********Found**********
        JOptionPane.showMessageDialog( null, output,
                "对考试结果的分析示例",
                JOptionPane.INFORMATION_MESSAGE );
//*********Found**********
        System.exit( 0 );
    }
}
