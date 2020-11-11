package com.isoftstone.colin.idea.service.impl;

import com.isoftstone.colin.idea.dao.IUserDao;
import com.isoftstone.colin.idea.entity.User;
import com.isoftstone.colin.idea.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSeriviceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
