package com.example.dao;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.apache.ibatis.annotations.Mapper;

@TableName("tb_user")
@Data
public class User {
    private Integer id;
    private String username;
    private String addr;
}
