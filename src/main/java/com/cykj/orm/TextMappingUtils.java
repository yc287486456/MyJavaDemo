package com.cykj.orm;

import com.cykj.bean.User;
import org.dom4j.Element;

import java.util.Iterator;

public class TextMappingUtils {
    public static void main(String[] args) {
        User user=new User();
        user.setAccount("2555");
        user.setPassword("2555");
        user.setName("小明");
        Element root=MappingUtils.fetchxml();
        Element foo;
        for(Iterator i=root.elementIterator("table");i.hasNext();){
            foo= (Element) i.next();
            String sql=MappingUtils.fetchInsertsql(foo.attributeValue("name"));
            System.out.println(sql);

        }

    }
}
