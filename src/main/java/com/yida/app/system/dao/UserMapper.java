package com.yida.app.system.dao;

import com.yida.app.system.domain.User;
import org.springframework.stereotype.Repository;

@Repository(value = "userMapper")
public interface UserMapper {
    int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}