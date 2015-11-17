package com.yida.app.system.dao;

import com.yida.app.system.domain.Menu;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuMapper {
    int deleteByPrimaryKey(String id);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);
}