package com.dingli.test.test;

public class Test34 {
    public static void main(String[] args) {
        int year = 2018;
        int month = 11;
        int day = 27;

        int days = countDays(2018,11,27);
        System.out.println(days%7);

        // 计算本月的1号是星期几
        int oneDay = (days - day + 1) %7;

        int totalDays = monthDays[month];
        if(month == 2 && ((year % 4 == 0 && year % 100 != 0)||year%400 == 0)){
            totalDays += 1;
        }
        System.out.println("一\t二\t三\t四\t五\t六\t天");
        for(int i = 1; i <= totalDays; i++){
            if(i == 1){
                for(int j = 1; j < oneDay; j++){
                    System.out.print("\t");
                }
            }
            System.out.println(i + "\t");
            if((totalDays + oneDay) % 7 == 0){
                System.out.println();
            }
        }
    }
    private static int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};
    public static int countDays(int year,int month,int day){
        int num = 0;
        for(int y = 1900; y < year; y++){
            num += 365;
            if((y % 4 == 0 && y % 100 != 0)||y % 400 == 0){
                num += 366;
            }else{
                num += 365;
            }
        }
        // 计算已过去的月份多少天

        for(int m = 0; m < month -1; m++){
            num += monthDays[m];
        }
        // 判断超过2月，如果又是闰年就加一天
        // 因为上面计算月份的天数，二月少了一天
        if(month > 2 && (year % 4 == 0 && year % 100 != 0)||year % 400 == 0){
            num += 1;
        }

        return num;
    }
}
