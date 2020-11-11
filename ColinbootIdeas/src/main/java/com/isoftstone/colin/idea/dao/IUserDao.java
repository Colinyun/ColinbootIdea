package com.isoftstone.colin.idea.dao;

import com.isoftstone.colin.idea.entity.User;

import java.util.List;

public interface IUserDao {

    List<User> findAll();
}
