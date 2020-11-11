package com.isoftstone.colin.idea.mapper;

import com.isoftstone.colin.idea.entity.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User user = new User();
        user.setId(resultSet.getInt("id"));
        user.setNickname(resultSet.getString("nickname"));
        user.setMobile(resultSet.getString("mobile"));
        user.setSalt(resultSet.getString("salt"));
        user.setAccount(resultSet.getString("account"));
        user.setCreateUser(resultSet.getInt("createUser"));
        user.setCreateDate(resultSet.getDate("createDate"));
        user.setModifier(resultSet.getInt("modifier"));
        user.setModifyDate(resultSet.getDate("modifyDate"));
      return user;
    }
}
