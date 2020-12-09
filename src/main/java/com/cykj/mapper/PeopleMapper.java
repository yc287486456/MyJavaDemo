package com.cykj.mapper;

import com.cykj.bean.People;
import com.cykj.bean.PeopleParmars;
import com.cykj.bean.User;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface PeopleMapper {
//    List<User> userList(People people);
//    int updateDemo(People people);
//    List<User> foreach(RowBounds rb);
//    public void deleteUser(People people);
//    public void updateUser(People people);
    public People selectPeople(People people);
    List<People> selectParmars();
    List<PeopleParmars> selectMorePeople();
    List<PeopleParmars> selectOneMore();
    List<People> selectMoreOne();
}
