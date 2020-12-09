package com.cykj.mapper;

import com.cykj.bean.User;
import org.apache.ibatis.session.RowBounds;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface AdminUserControlMapper {
    public List<User> userTableSelect(RowBounds rb,Map<String,String> hasMap);
    int selectCount();
}
