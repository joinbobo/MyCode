package com.dingli.snake.core.impl;

import com.dingli.snake.core.Drawable;

import java.awt.*;

public class SnakeObject implements Drawable {
    int x;  //横坐标
    int y;  //纵坐标
    Image img; //图片
    int width;  //图片宽度
    int height; //图片高度

    public boolean live;    //死亡/存活

    @Override
    public void draw(Graphics g) {
        /**
         *  获取图片对应的矩形
         */
    }
    public Rectangle getRectangle(){
        return new Rectangle(x, y, width, height);
    }
}
