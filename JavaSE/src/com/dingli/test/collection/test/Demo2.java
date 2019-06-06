package com.dingli.test.collection.test;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo2 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0;i < 100;i++){
            int num = (int)(Math.random()*101);
            set.add(num);
        }
        System.out.println(set);


        Set<Integer> set1 = new TreeSet<>();

    }
}
