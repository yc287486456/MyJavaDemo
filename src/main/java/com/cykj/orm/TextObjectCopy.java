package com.cykj.orm;

import com.cykj.bean.People;
import com.cykj.bean.User;

public class TextObjectCopy {
    public static void main(String[] args) {
        User user=new User();
        user.setName("xiaoming");
        User user1 = (User) ObjectCopy.copy(user);
        System.out.println(user1.getName());
    }




}
