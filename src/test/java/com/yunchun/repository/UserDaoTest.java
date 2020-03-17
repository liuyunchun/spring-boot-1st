package com.yunchun.repository;

import com.yunchun.domain.User;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class UserDaoTest {

    @Resource
    private UserDao userDao;

    @Test
    public void testUser() {
        User user = new User();
        user.setName("sungyeh");
        user.setAge(123);
        user.setCreator("sungyeh");
        userDao.insert(user);
        User result = userDao.find("sungyeh");
        Assertions.assertThat(result).isNotNull();
        System.err.println(result);

        result.setAge(999);
        result = userDao.update(result);
        Assertions.assertThat(result.getAge()).isEqualTo(999);
        System.err.println(result);
        userDao.delete(user.getName());
        result = userDao.find("sungyeh");
        Assertions.assertThat(result).isNull();

    }

}
