package com.zixue.test.test;

import javax.swing.*;
import java.text.DecimalFormat;

public class Demo30 {
    public static void main( String args[] ){
        double amount, principal = 1000.0, rate = .05;
        DecimalFormat precisionTwo = new DecimalFormat( "0.00" );
//*********Found**********
        JTextArea outputTextArea = new JTextArea( 11, 20 );
        outputTextArea.append( "年\t存款总计\n" );
        for ( int year = 1; year <= 10; year++ ) {
            amount = principal * Math.pow( 1.0 + rate, year );
            outputTextArea.append( year + "\t" +
//*********Found**********
                    precisionTwo.format( amount ) + "\n" );
        }
//*********Found**********
        JOptionPane.showMessageDialog(
                null, outputTextArea, "复合利息",
                JOptionPane.INFORMATION_MESSAGE );
        System.exit( 0 );
    }
}
