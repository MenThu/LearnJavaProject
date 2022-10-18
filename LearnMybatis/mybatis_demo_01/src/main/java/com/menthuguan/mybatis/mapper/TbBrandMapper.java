package com.menthuguan.mybatis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.menthuguan.mybatis.pojo.Brand;
import org.apache.ibatis.annotations.Param;

public interface TbBrandMapper extends BaseMapper <Brand> {
    public Brand selectBrandById(@Param("brandId") Integer brandId);
}
