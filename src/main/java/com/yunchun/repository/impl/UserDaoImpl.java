package com.yunchun.repository.impl;

import com.yunchun.domain.User;
import com.yunchun.repository.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public User insert(User user) {
        System.out.println("新增資料:" + user);
        return null;
    }

    @Override
    public void delete(String name) {
        System.out.println("刪除資料:" + name);
    }

    @Override
    public User update(User user) {
        System.out.println("更新資料:" + user);
        return null;
    }

    @Override
    public User find(String name) {
        System.out.println("查詢資料:" + name);
        return null;
    }
}
