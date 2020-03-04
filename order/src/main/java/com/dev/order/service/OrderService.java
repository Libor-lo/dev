package com.dev.order.service;

import com.dev.order.entity.Orders;


import java.math.BigDecimal;

/**
 * @author IT云清
 */
public interface OrderService {

    /**
     * 创建订单
     * @param orders
     * @return
     */
    void create(Orders orders);

    /**
     * 修改订单状态
     * @param userId
     * @param money
     * @param status
     */
    void update(Integer userId, BigDecimal money, Integer status);
}
