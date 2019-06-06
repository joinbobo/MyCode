package com.dingli.test.test;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = {20,10,15,4,1,2};

        System.out.println(Arrays.toString(arr));


        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int max = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = max;
                }
            }

        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
