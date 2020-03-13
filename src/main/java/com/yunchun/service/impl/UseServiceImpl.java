package com.yunchun.service.impl;

import com.yunchun.domain.User;
import com.yunchun.repository.UserDao;
import com.yunchun.repository.impl.UserDaoImpl;
import com.yunchun.service.UserService;

public class UseServiceImpl implements UserService {
    @Override
    public User insert(User user) {
        System.out.println("新增前動手腳");
        UserDao dao = new UserDaoImpl();
        dao.insert(user);
        return null;
    }

    @Override
    public void delete(String name) {
        System.out.println("刪除前動手腳");
        UserDao dao = new UserDaoImpl();
        dao.delete(name);

    }

    @Override
    public User update(User user) {
        System.out.println("更新前動手腳");
        UserDao dao = new UserDaoImpl();
        dao.update(user);
        return null;
    }

    @Override
    public User find(String name) {
        System.out.println("查詢前動手腳");
        UserDao dao = new UserDaoImpl();
        dao.find(name);
        return null;
    }
}
