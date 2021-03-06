package com.yunchun.mapper;

import com.yunchun.domain.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
        User user = new User();
        user.setAge(resultSet.getInt("AGE_"));
        user.setName(resultSet.getString("NAME_"));
        user.setCreator(resultSet.getString("CREATOR_"));
        return user;
    }
}
