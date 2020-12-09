package com.cykj.mapper;

import com.cykj.bean.PeopleSelect;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface PeopleSelectMapper {

    List<PeopleSelect> peopleSelectList(RowBounds rb);
    int userCount();
}
