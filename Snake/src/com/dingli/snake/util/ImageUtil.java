package com.dingli.snake.util;

import com.dingli.snake.constant.Constant;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class ImageUtil {
    /**
     * 存储图片方便使用
     */
    public static Map<String,Image> images = new HashMap<>();

    static{
        images.put("snake_body", GameUtil.getImage(Constant.IMG_PRE + "snake_body.png"));
        images.put("food", GameUtil.getImage(Constant.IMG_PRE + "snake_body.png"));
        images.put("snake_head", GameUtil.getImage(Constant.IMG_PRE + "snake_head.png"));
        images.put("background", GameUtil.getImage(Constant.IMG_PRE + "background2.jpg"));
        images.put("fail", GameUtil.getImage(Constant.IMG_PRE + "fail.png"));

    }
}
