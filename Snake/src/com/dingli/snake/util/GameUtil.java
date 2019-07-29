package com.dingli.snake.util;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

//获取图片和处理图片旋转
public class GameUtil {
    /**
     *  根据图片的相对路径获取图片
     *  @param imagePath
     *  @return 图片
     */
    public static Image getImage(String imagePath){
        URL url = GameUtil.class.getClassLoader().getResource(imagePath);
        BufferedImage img = null;
        try {
            img = ImageIO.read(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return img;
    }

    /**
     *  按指定角度旋转图片
     *  @param bufferedImage
     *  @param degree
     *  @return 图片
     */
    public static Image rotateImage(final BufferedImage bufferedImage, final int degree){
        int w = bufferedImage.getWidth();   //得到图片宽度
        int h = bufferedImage.getHeight();  //得到图片高度
        int type = bufferedImage.getColorModel().getTransparency(); //得到图片透明度
        BufferedImage img;  //空的图片
        Graphics2D graphics2d;  //空的画笔
        (graphics2d = (img = new BufferedImage(w, h, type)).createGraphics())
                .setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        graphics2d.rotate(Math.toRadians(degree), w/2, h/2);    //旋转，degree是整型，度数，比如垂直90度
        graphics2d.drawImage(bufferedImage, 0, 0, null);    //从bufferedImagecopy图片至img，0,0是img的坐标
        graphics2d.dispose();
        return img; //返回复制好的图片，原图片依然没有变，没有旋转，下次还可以使用

    }
}
