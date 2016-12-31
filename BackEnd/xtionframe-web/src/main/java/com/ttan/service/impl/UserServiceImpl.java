package com.ttan.service.impl;

import com.ttan.dao.IUserDao;
import com.ttan.pojo.User;
import com.ttan.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;

    @Override
    public User getUserById(int id) {
        // TODO Auto-generated method stub
        return this.userDao.selectByPrimaryKey(id);
    }

}
