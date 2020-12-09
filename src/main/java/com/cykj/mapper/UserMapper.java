package com.cykj.mapper;

import com.cykj.bean.User;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface UserMapper {
    public int insertUser(User user);
    public User selectUser(User user);
    public User selectUserAccount(User user);

}
