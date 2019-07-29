//package com.dingli.test.service.test4;
//
//import net.sf.json.JSONArray;
//import net.sf.json.JSONObject;
//
//
///**
// * 利用JSONObject、JSONArray完成下面数据结构
// */
//public class Demo8 {
//    public static void main(String[] args) {
//        //创建JSONObject对象
//        JSONObject object1 = new JSONObject();
//        object1.put("id", "2280");
//        object1.put("name", "成都市");
//        object1.put("fullName", "四川省成都市");
//
//        JSONObject object2 = new JSONObject();
//        object2.put("id", "2321");
//        object2.put("name", "德阳市");
//        object2.put("fullName", "四川省德阳市");
//
//        JSONObject object3 = new JSONObject();
//        object3.put("id", "2328");
//        object3.put("name", "绵阳市");
//        object3.put("fullName", "四川省绵阳市");
//
//        //创建JSONArray对象
//        JSONArray array = new JSONArray();
//        array.add(object1);
//        array.add(object2);
//        array.add(object3);
//
//        System.out.println("body:" + array);//错误
//        System.out.println("body:" + array.toString());//错误
//
//        JSONObject array2 = new JSONObject();
//        array2.put("body",array);
//        System.out.println(array2.toString());
//
//    }
//}
