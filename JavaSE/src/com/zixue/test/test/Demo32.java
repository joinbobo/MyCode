package com.zixue.test.test;

import javax.swing.*;
import java.text.DecimalFormat;

public class Demo32 {
    //*********Found**********
    public static void main( String args[] ){
        SimpleTime t = new SimpleTime( 12, 30, 19 );
//*********Found**********
        JOptionPane.showMessageDialog( null, t.buildString(),
                " \"this\" 引用示范",
                JOptionPane.INFORMATION_MESSAGE );
        System.exit( 0 );
    }
}

class SimpleTime {
    private int hour, minute, second;
    public SimpleTime( int hour, int minute, int second ){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String buildString(){
//*********Found**********
        return "this.toString(): " + toString() +
                "\ntoString(): " + toString() +
                "\nthis (with implicit toString() call): " +
                this;
    }

    public String toString(){
        DecimalFormat twoDigits = new DecimalFormat( "00" );
        return twoDigits.format( this.hour ) + ":" +
                twoDigits.format( this.minute ) + ":" +
                twoDigits.format( this.second );
    }
}
