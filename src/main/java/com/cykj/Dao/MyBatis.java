package com.cykj.Dao;

import com.cykj.Util.MyBatisUtil;
import com.cykj.Util.ObjectFactory;
import com.cykj.bean.People;
import com.cykj.bean.PeopleParmars;
import com.cykj.bean.User;
import com.cykj.mapper.PeopleMapper;
import com.cykj.mapper.UserMapper;
import com.cykj.orm.MappingUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MyBatis {

//        public User userSelect(String account,String password){
//            User user=new User();
//            String driver="com.mysql.jdbc.Driver";
//            String url="jdbc:mysql://localhost:3306/user";
//            try {
//                Class.forName(driver);
//                Connection connection= DriverManager.getConnection(url,"root","123456");
//                String sql="select * from user where account=? and password=? ";
//                PreparedStatement preparedStatement=connection.prepareStatement(sql);
//                preparedStatement.setString(1,account);
//                preparedStatement.setString(2,password);
//                ResultSet rs=preparedStatement.executeQuery();
//                while (rs.next()){
//                    user.setAccount(rs.getString("account"));
//                    user.setPassword(rs.getString("password"));
//                    user.setName(rs.getString("name"));
//                }
//            } catch (ClassNotFoundException | SQLException e) {
//                e.printStackTrace();
//            }
//
//            return user;
//        }
public static void main(String[] args) {
    //把配置文件读取到io流
//    try {
//        Reader reader= Resources.getResourceAsReader("mybatis-config.xml");
//        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
//        SqlSession sqlSession=sqlSessionFactory.openSession(false);//打开事务，取消自动提交
//        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
//        User user=new User();
//        user.setId(3);
//        user.setName("王四狗");
//        user.setAccount("88");
//        user.setPassword("2222");
//        userMapper.deleteUser(user);
//        sqlSession.commit();
//        sqlSession.close();
//    } catch (IOException e) {
//        e.printStackTrace();
//    }
//        User user=new User();
//        user.setId(3);
//        user.setName("王四狗");
//        user.setAccount("88");
//        user.setPassword("2222");
//        SqlSession sqlSession= MyBatisUtil.getMyBatisUtil().getSqlSession();
//        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
////        List<User> userList=userMapper.selectUser(user);
//        sqlSession.commit();
//        sqlSession.close();



        SqlSession sqlSession= MyBatisUtil.getMyBatisUtil().getSqlSession();
        PeopleMapper peopleMapper=sqlSession.getMapper(PeopleMapper.class);
        People people=(People) ObjectFactory.getNewinstance("com.cykj.bean.People");
//        List<PeopleParmars> peopleList=peopleMapper.selectMorePeople();
        List<People> peopleList=peopleMapper.selectMoreOne();
//        User user=new User();
//        user.setId(9);
//        user.setName("小明");
//        List list=new ArrayList();
//        list.add(6);
//        list.add(9);
//        RowBounds rb=new RowBounds(1,2);
//        List<User> userList=userMapper.foreach(rb);
}

}
