package com.yunchun.repository;

import com.yunchun.domain.User;

public interface UserDao {
    User insert(User user);

    void delete(String name);

    User update(User user);

    User find(String name);
}
