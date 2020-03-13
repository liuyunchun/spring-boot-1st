package com.yunchun.service;

import com.yunchun.domain.User;

public interface UserService {
    User insert(User user);

    void delete(String name);

    User update(User user);

    User find(String name);
}
