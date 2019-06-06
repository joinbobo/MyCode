package com.dingli.test.object;

import java.util.Arrays;

public class CompareDemo3 {
    public static void main(String[] args) {
        Teacher[] arr = {
                new Teacher("老周",22),
                new Teacher("老李",34),
                new Teacher("老赵",33),
                new Teacher("老张",29),
        };
        Arrays.sort(arr);

        for(Teacher t : arr){
            System.out.println(t);
        }
    }
}
