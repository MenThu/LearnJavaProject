package com.menthuguan.mybatis.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_brand")
public class Brand {
    private Integer id;
    private String brand_name;
    private String company_name;
    private Integer ordered;
    private String description;
    private Integer status;

    public void setId(Integer id) {
        this.id = id;
    }
}
