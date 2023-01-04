package com.atguigu.springcloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @version 1.0
 * @description: TODO
 * @date 2023/1/4 22:24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Storage {

    private Long id;

    private Long productId;

    private Integer total;

    private Integer used;

    private Integer residue;
}
