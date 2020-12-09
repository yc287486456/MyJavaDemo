package com.cykj.Dao;

import com.cykj.Util.MyBatisUtil;
import com.cykj.bean.AdminUser;
import com.cykj.bean.User;
import com.cykj.mapper.AdminUserControlMapper;
import com.cykj.mapper.AdminUserMapper;
import com.cykj.mapper.PeopleSelectMapper;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

public class AdminUserControlDao {

    public List<User> userList(RowBounds rb, Map<String,String> hasMap){
        SqlSession sqlSession= MyBatisUtil.getMyBatisUtil().getSqlSession();
        AdminUserControlMapper adminUserControlMapper=sqlSession.getMapper(AdminUserControlMapper.class);
        List<User> userList=adminUserControlMapper.userTableSelect(rb,hasMap);
        return userList;
    }
    public int tableCount(Map<String,String> hasMap){
        SqlSession sqlSession= MyBatisUtil.getMyBatisUtil().getSqlSession();
        AdminUserControlMapper adminUserControlMapper=sqlSession.getMapper(AdminUserControlMapper.class);
        int tableCount=adminUserControlMapper.selectCount();
        return tableCount;
    }
}
