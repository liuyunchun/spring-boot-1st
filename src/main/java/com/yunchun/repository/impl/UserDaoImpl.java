package com.yunchun.repository.impl;

import com.yunchun.domain.User;
import com.yunchun.mapper.UserMapper;
import com.yunchun.repository.UserDao;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("com.yunchun.repository.impl.UserDaoImpl")
public class UserDaoImpl implements UserDao {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public User insert(User user) {
        jdbcTemplate.update("INSERT INTO USER(NAME_,AGE_) VALUES(?,?)", user.getName(), user.getAge());
        return user;
    }

    @Override
    public void delete(String name) {
        jdbcTemplate.update("DELETE FROM USER WHERE NAME_=?", name);
    }

    @Override
    public User update(User user) {
        jdbcTemplate.update("UPDATE USER " +
                "SET AGE_=? " +
                "WHERE NAME_=? ", user.getAge(), user.getName());
        return user;
    }

    @Override
    public User find(String name) {
        User user;
        try {
            user = (User) jdbcTemplate.queryForObject("SELECT * FROM USER WHERE NAME_=?", new Object[]{name}, new UserMapper());

        } catch (EmptyResultDataAccessException e) {
            user = null;
        }
        return user;
    }
}
