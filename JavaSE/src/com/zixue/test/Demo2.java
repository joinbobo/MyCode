package com.zixue.test;

import javax.swing.*;
import java.awt.Container;
import java.net.URL;

public class Demo2 extends JFrame {
    private JLabel j1 = new JLabel();   //声明JFrame对象
    private static Thread t;    //线程对象
    private int count = 0;  //计数变量
    private Container container = getContentPane(); //声明容器
    public Demo2(){
        setBounds(300,200,250,100);
        container.setLayout(null);  //不适用任何布局管理器
        try{
            // 获取图片的url
            URL url = Demo2.class.getResource("图片1.png");
            Icon icon = new ImageIcon(url); //实例化一个Icon
            j1.setIcon(icon);   //将图标放置在标签中
        }catch(NullPointerException ex){
            System.out.println("图片不存在！");
            return;
        }
        // 设置图片在标签的最左方
        j1.setHorizontalAlignment(SwingConstants.LEFT);
        j1.setBounds(10,10,200,50); //设置标签的位置与大小
        j1.setOpaque(true);
        t = new Thread(new Roll());
        t.start();
        container.add(j1);  //将标签添加到容器中
        setVisible(true);   //使窗体可见
        //设置窗体的关闭方式
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
    class Roll implements Runnable {

        @Override
        public void run() {
            while (count <= 200) {
                // 将标签的横坐标用变量表示
                j1.setBounds(count, 10, 200, 50);
                try {
                    Thread.sleep(100);    //为了体现进度条移动效果，使线程休眠1000毫秒
                } catch (Exception e) {
                    e.printStackTrace();
                }
                count += 4; //使横坐标每次增加4
                if (count == 200) {
                    // 当图标到达标签的最右边时，使其回到标签最左边
                    count = 10;
                }
            }
        }
    }

        public static void main(String[] args) {
            new Demo2();   //实例化一个SwingAndThread对象
        }
    }


