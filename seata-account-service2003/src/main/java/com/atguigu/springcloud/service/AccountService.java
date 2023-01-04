package com.atguigu.springcloud.service;

import java.math.BigDecimal;

/**
 * @version 1.0
 * @description: TODO
 * @date 2023/1/4 22:46
 */
public interface AccountService {

    void decrease(Long userId, BigDecimal money);

}
