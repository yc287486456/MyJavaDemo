package com.cykj.Util;

public class ObjectFactory {
    public static Object getNewinstance(String className){
        Object object=null;
        try {
            Class classes=Class.forName(className);
            object=classes.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return object;
    }
}
