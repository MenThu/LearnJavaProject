package com.example;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.dao.User;
import com.example.domain.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootSsmApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        User user = userMapper.selectById(1);
        System.out.println("use mp to select" + user.toString());
    }

    @Test
    void testGetPage(){
        Integer pageNo = 2;
        Integer pageSize = 4;
        IPage<User> page = new Page<User>(pageNo, pageSize);
        userMapper.selectPage(page, null);
        System.out.println(page);
    }

    @Test
    void testQuery(){
        LambdaQueryWrapper<User> userLambdaQueryWrapper = new LambdaQueryWrapper<User>();
        userLambdaQueryWrapper.like(User::getUsername, "4");
        List<User> userList = userMapper.selectList(userLambdaQueryWrapper);
        System.out.println(userList);
    }

}
