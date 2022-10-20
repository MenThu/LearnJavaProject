package com.example;

import com.example.dao.UserDao;
import com.example.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Spring03MybatisApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void contextLoads() {

    }

    @Test
    void testUserDao(){
        User user = userDao.getById(1);
        System.out.println("UserDao");
        System.out.println(user);
    }

}
