package com.cykj.Util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class MyBatisUtil {
    //mybatis配置文件路劲
    private static final String CONFIG_PATH="mybatis-config.xml";
    //SqlSessionFactory工厂对象
    private SqlSessionFactory sqlSessionFactory=null;
    private SqlSession sqlSession=null;
    private  static  MyBatisUtil myBatisUtil;


    private MyBatisUtil(){
        Reader reader=null;
        try {
            reader= Resources.getResourceAsReader(CONFIG_PATH);
          sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
          sqlSession=sqlSessionFactory.openSession(false);//打开事务，取消自动提交
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(null!=reader){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static synchronized MyBatisUtil getMyBatisUtil(){
        if(myBatisUtil==null){
            synchronized (MyBatisUtil.class){
                myBatisUtil=new MyBatisUtil();
            }
        }
        return myBatisUtil;
    }

    public  synchronized SqlSession getSqlSession(){
        return sqlSession;
    }
}
