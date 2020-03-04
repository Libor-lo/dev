package com.dev.order.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 订单
 * @author IT云清
 */
@Data
public class Orders {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private Integer userId;

    private Integer productId;

    private Integer count;

    private BigDecimal money;

    /**订单状态：0：创建中；1：已完结*/
    private Integer status;

}
