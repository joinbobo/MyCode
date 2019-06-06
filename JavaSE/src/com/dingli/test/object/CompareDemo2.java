package com.dingli.test.object;

import java.util.Arrays;
import java.util.Comparator;

public class CompareDemo2 {
    public static void main(String[] args) {
        Student s1 = new Student("张三",24,98);
        Student s2 = new Student("李四",23,68);
        Student s3 = new Student("王五",20,88);
        Student s4 = new Student("唐二",24,100);
        Student s5 = new Student("刘大",21,79);
        Student s6 = new Student("赵七",23,89);
        Student[] arr = {s1,s2,s3,s4,s5,s6};

        Arrays.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        for(Student s : arr){
            System.out.println(s);
        }
    }
}
