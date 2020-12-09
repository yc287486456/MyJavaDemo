package com.cykj.Dao;

import com.cykj.Util.MyBatisUtil;
import com.cykj.bean.PeopleSelect;
import com.cykj.mapper.PeopleSelectMapper;
import com.cykj.orm.MappingUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class PeopleSelectDao {
        public List<PeopleSelect> peopleSelectList(RowBounds rb){
            SqlSession sqlSession= MyBatisUtil.getMyBatisUtil().getSqlSession();
            PeopleSelectMapper peopleSelectMapper=sqlSession.getMapper(PeopleSelectMapper.class);
            List<PeopleSelect> peopleSelectList=peopleSelectMapper.peopleSelectList(rb);
            return peopleSelectList;
        }
    public int peopleCount(){
        SqlSession sqlSession= MyBatisUtil.getMyBatisUtil().getSqlSession();
        PeopleSelectMapper peopleSelectMapper=sqlSession.getMapper(PeopleSelectMapper.class);
         int countPeople=peopleSelectMapper.userCount();
        return countPeople;
    }
}
