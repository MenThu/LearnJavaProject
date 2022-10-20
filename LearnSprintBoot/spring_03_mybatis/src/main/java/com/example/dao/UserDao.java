package com.example.dao;

import com.example.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

//公司开发的项目中，接口类并没有用
@Mapper
public interface UserDao {

    @Select("select * from tb_user where id = #{id}")
    User getById(Integer id);
}
