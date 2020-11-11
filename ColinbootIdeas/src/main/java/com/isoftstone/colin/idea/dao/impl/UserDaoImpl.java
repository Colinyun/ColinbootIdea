package com.isoftstone.colin.idea.dao.impl;

import com.isoftstone.colin.idea.dao.IUserDao;
import com.isoftstone.colin.idea.entity.User;
import com.isoftstone.colin.idea.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements IUserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<User> findAll() {
        String sql = "SELECT * FROM t_user";
        return jdbcTemplate.query(sql,new UserMapper());
    }
}
