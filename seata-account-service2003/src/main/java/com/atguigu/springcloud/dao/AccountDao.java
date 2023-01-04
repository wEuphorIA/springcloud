package com.atguigu.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @version 1.0
 * @description: TODO
 * @date 2023/1/4 22:45
 */
@Mapper
public interface AccountDao {

    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);

}
