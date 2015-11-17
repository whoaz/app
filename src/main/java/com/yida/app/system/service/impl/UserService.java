package com.yida.app.system.service.impl;

import com.yida.app.system.dao.UserMapper;
import com.yida.app.system.domain.User;
import com.yida.app.system.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by zhouk on 2015/11/17.
 */
@Service
@Transactional
public class UserService implements IUserService{

    private @Resource UserMapper userMapper;

    @Override
    public User getUser() {
        return userMapper.selectByPrimaryKey("1");
    }
}
