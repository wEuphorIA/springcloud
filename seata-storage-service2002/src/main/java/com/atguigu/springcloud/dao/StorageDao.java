package com.atguigu.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @version 1.0
 * @description: TODO
 * @date 2023/1/4 22:25
 */
@Mapper
public interface StorageDao {

    void decrease(@Param("productId") Long productId, @Param("count") Integer count);

}
