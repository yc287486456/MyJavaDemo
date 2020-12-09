package com.cykj.orm;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.lang.reflect.Field;

public class MappingUtils {
    /*
    获取并解析xml
     */
     public static Element fetchxml(){
         File file=new File("src/main/resources/TextUser.xml");
         //实列化xml解析器
         SAXReader reader=new SAXReader();
         try {
             Document document=reader.read(file);
             //获取根节点
             Element root=document.getRootElement();
             return  root;
         } catch (DocumentException e) {
             e.printStackTrace();
         }
         return null;
     }
     public static String fetchInsertsql(String bean){
         try {
             Class classes=Class.forName(bean);
             String clzstr=classes.toString();
             //获取类名
             String beanName=clzstr.substring(clzstr.lastIndexOf(".")+1).toLowerCase();
             //获取类中的属性
             Field[] fields=classes.getDeclaredFields();
             StringBuffer sb=null;
             String fileNames="";
             for(Field field:fields){
                 fileNames+=","+field.getName();
                 if(sb==null){
                    sb=new StringBuffer();
                    sb.append("?");
                 }else{
                     sb.append(", ?");
                 }
             }
             return "insert into "+beanName+"（"+fileNames.substring(1)+"） values ("+sb.toString()+")";

         } catch (ClassNotFoundException e) {
             e.printStackTrace();
         }
         return null;
     }
}
