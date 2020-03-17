package com.yunchun.service.impl;

import com.yunchun.domain.User;
import com.yunchun.repository.UserDao;
import com.yunchun.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("com.yunchun.service.impl.UseServiceImpl")
public class UseServiceImpl implements UserService {

    @Resource
    private UserDao dao;

    @Override
    public User insert(User user) {
        System.out.println("新增前動手腳");
        user.setCreator("admin");
        return dao.insert(user);
    }

    @Override
    public void delete(String name) {
        System.out.println("刪除前動手腳");
        dao.delete(name);

    }

    @Override
    public User update(User user) {
        System.out.println("更新前動手腳");
        return dao.update(user);
    }

    @Override
    public User find(String name) {
        System.out.println("查詢前動手腳");
        return dao.find(name);
    }
}
