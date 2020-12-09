package com.cykj.orm;

import com.cykj.bean.People;
import com.cykj.bean.User;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ObjectClasses {
    public static void main(String[] args) {
        //构造任意一个类的对象
        Class<User> userClass=User.class;
//        try {
////            //无参数
////            User user=userClass.newInstance();
////        } catch (InstantiationException e) {
////            e.printStackTrace();
////        } catch (IllegalAccessException e) {
////            e.printStackTrace();
////        }
            //通过Constructor类来获取类对象（带参数）
//        try {
//            Constructor<User> userConstructor=userClass.getConstructor(String.class,String.class);
//            User user= null;
//            try {
//                user = userConstructor.newInstance("peter","1712");
//                System.out.println(user.getName()+user.getAccount());
//            } catch (InstantiationException e) {
//                e.printStackTrace();
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//            } catch (InvocationTargetException e) {
//                e.printStackTrace();
//            }
//            } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        }
//        //获取类的方法
//        try {
//            //实列化一个对象
//            User user=userClass.newInstance();
//            Method[] methods=userClass.getDeclaredMethods();
//            for (Method method:methods){
//                System.out.println(method.getName());
//            }
//            //获取到一个方法然后执行
//            Method method=userClass.getMethod("getName");
//            method.invoke(user,"peter");
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        }



        Class<People> peopleClass=People.class;
        try {
            Method method1=peopleClass.getMethod("getName");
            System.out.println(method1);
            Method method2=userClass.getMethod("setName",String.class);
            User user=userClass.newInstance();
            method2.invoke(user,method1);
            System.out.println(user.getName());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
