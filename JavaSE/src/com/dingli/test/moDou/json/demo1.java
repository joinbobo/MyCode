package com.dingli.test.moDou.json;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import static javax.swing.UIManager.put;

public class demo1 {
    public static void main(String[] args) {
        JSONObject json = new JSONObject();
        json.put("key1","张三");
        json.put("key2","李四");
        json.put("key3","王二");

        Boolean isSucess = true;
        json.put("status",isSucess);

        System.out.println(json.size());

        System.out.println(json.containsKey("key1"));//是否含有 key1 的key值
        System.out.println(json.containsValue("李四"));

        JSONObject object = new JSONObject();
        object.put("computer_1","显示器");
        object.put("computer_2","主机");
        object.put("computer_3","键盘");
        object.put("computer_4","鼠标");

//        JSONArray array = new JSONArray();
//        class.put("class_1","桌子");
//        class.put("class_2","椅子");
//
//        JSONArray school = new JSONArray();
//        school.put("name","班");
//        school.put("class","array");
//        array.add(object);


    }
}
