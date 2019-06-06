package com.dingli.javaee.test;

import java.io.*;
import java.util.Arrays;

public class demo2 {
    /**
     * 读取中文字符的文件
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        try {
			/*FileInputStream fis = new FileInputStream("E:/iodemo/ch04.txt");
			//包装流
			BufferedInputStream bis = new BufferedInputStream(fis);*/
            //包装流
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\考试2文件.txt"));
            //读取文件内容
            byte[] b = new byte[bis.available()];
            bis.read(b);

			/*char[] c = new char[b.length];
			for (int i = 0; i < c.length; i++) {
				c[i]=(char) b[i];
			}
			System.out.println(Arrays.toString(c));//乱码
			 */

            System.out.println(Arrays.toString(b));//得到的是字节
            //String(byte[])把字节数组转成字符串
            System.out.println(new String(b));//可以得到中文
            bis.close();//关闭流(关闭bis就可以了)
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
