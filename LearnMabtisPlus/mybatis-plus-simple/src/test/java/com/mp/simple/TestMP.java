package com.mp.simple;

import com.baomidou.mybatisplus.core.MybatisSqlSessionFactoryBuilder;
import com.mp.simple.mapper.MpUserMapper;
import com.mp.simple.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMP {
    @Test
    public void testFindAll() throws IOException {
        SqlSession sqlSession = getSqlSession();
        MpUserMapper mapper = sqlSession.getMapper(MpUserMapper.class);
        List<User> userList = mapper.selectList(null);
        System.out.println(userList);
    }

    public SqlSession getSqlSession() throws IOException, IOException {
        InputStream asStream = Resources.getResourceAsStream("mybatis-config.xml");
        MybatisSqlSessionFactoryBuilder sqlSessionFactoryBuilder = new MybatisSqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(asStream);
        return sqlSessionFactory.openSession(true);
    }

}
