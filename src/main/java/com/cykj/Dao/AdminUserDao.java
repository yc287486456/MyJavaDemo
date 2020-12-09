package com.cykj.Dao;

import com.cykj.Util.MyBatisUtil;
import com.cykj.bean.AdminUser;
import com.cykj.bean.User;
import com.cykj.mapper.AdminUserMapper;
import com.cykj.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;

public class AdminUserDao {
        public AdminUser login(AdminUser adminUser){
            SqlSession sqlSession= MyBatisUtil.getMyBatisUtil().getSqlSession();
            AdminUserMapper adminUserMapper=sqlSession.getMapper(AdminUserMapper.class);
            AdminUser adminUser1=adminUserMapper.login(adminUser);
            return adminUser1;
        }

}
