package com.cykj.Dao;

import com.cykj.Util.MyBatisUtil;
import com.cykj.Util.ObjectFactory;
import com.cykj.bean.User;
import com.cykj.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;

public class UserDao {
        User user = (User) ObjectFactory.getNewinstance("com.cykj.bean.User");
    public User getUser( String account,String password){
        SqlSession sqlSession= MyBatisUtil.getMyBatisUtil().getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        user.setPassword(password);
        user.setAccount(account);
        User user1= userMapper.selectUser(user);
        return user1;
    }
    public User selectUserAccount(String Account){
        SqlSession sqlSession=MyBatisUtil.getMyBatisUtil().getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        user.setAccount(Account);
        User user1=userMapper.selectUserAccount(user);
        return user1;
    }
    public int insertUser(User user){
        SqlSession sqlSession=MyBatisUtil.getMyBatisUtil().getSqlSession();
        UserMapper userMappers=sqlSession.getMapper(UserMapper.class);
        int flag=userMappers.insertUser(user);
        sqlSession.commit();
        return flag;
    }
}
