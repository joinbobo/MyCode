package com.zixue.test.test;

public class Demo11 {
    public static void main(String[] args){
        //*********Found**********
        int[]  scores = {90,80,75,67,53};
        int best = 0;
        char grade;

        // 找出这组成绩中的最高分
        //*********Found**********
        for (int i=0;i<scores.length; i++){
            //*********Found**********
            if (best < scores[i])
                best = scores[i];
        }

        //求各分数的等级并显示
        for (int i=0; i<scores.length; i++){
            if (scores[i] >= best - 10)
                grade = 'A';
            //*********Found**********
            else if (scores[i] >= best - 20)
            grade = 'B';
      else if (scores[i] >= best - 30)
                grade = 'C';
            else if (scores[i] >= best - 40)
                grade = 'D';
            else
                grade = 'F';
            System.out.println("Student " + i + " score is " + scores[i] +
                    " and grade is " + grade);
        }
    }
}
