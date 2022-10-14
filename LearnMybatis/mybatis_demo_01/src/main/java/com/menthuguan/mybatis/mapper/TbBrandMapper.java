package com.menthuguan.mybatis.mapper;

import com.menthuguan.mybatis.pojo.Brand;
import org.apache.ibatis.annotations.Param;

public interface TbBrandMapper {
    public Brand selectBrandById(@Param("brandId") Integer brandId);
}
