package com.cykj.orm;

import com.cykj.bean.User;

public class Classes {
    public static void main(String[] args) {
        //常获取Class类
        try {
            // 使用Class类的静态方法
            Class myclass=Class.forName("com.cykj.bean.user");
            //使用类.class的语法
            Class myclas= User.class;
            //使用对象的getClass方法
            User user=new User();
            user.getClass();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }




    }
}
