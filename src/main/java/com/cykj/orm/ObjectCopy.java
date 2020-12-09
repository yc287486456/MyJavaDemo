package com.cykj.orm;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ObjectCopy {
    public static Object copy(Object source){
        //创建一个新的对象
        Object target=null;
        //获取原对象的class对象
        Class clz=source.getClass();
        //实列化
        try {
            target=clz.newInstance();
            //获取属性名
            Field[] fields=clz.getDeclaredFields();
            for (Field field:fields){
                //获取属性名
                String fileName=field.getName();
                //根据属性名获取set和get方法
                String set="set"+fileName.substring(0,1).toUpperCase()+fileName.substring(1);
                String get="get"+fileName.substring(0,1).toUpperCase()+fileName.substring(1);
                //根据方法名获取方法对象
                Method methodSet=clz.getMethod(set,field.getType());
                Method methodGet=clz.getMethod(get);
                //执行原对象并获取返回值
                Object returnVal=methodGet.invoke(source);
                //执行目标对象的set方法并且赋值
                methodSet.invoke(target,returnVal);
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return target;
    }
}
