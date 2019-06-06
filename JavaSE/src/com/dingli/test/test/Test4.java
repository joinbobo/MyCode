package com.dingli.test.test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
        try{
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D://考试2文件.txt"));
            byte[] b = new byte[bis.available()];
            bis.read(b);

            System.out.println(new String(b));
            bis.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        int[] arr = {5,4,6,4,1};

        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int demp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = demp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
