package com.dev.order.dao;


import com.dev.order.entity.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author IT云清
 */
@Mapper
public interface OrderDao {

    /**
     * 创建订单
     * @param orders
     * @return
     */
    void create(Orders orders);

    /**
     * 修改订单金额
     * @param userId
     * @param money
     */
    void update(@Param("userId") Integer userId, @Param("money") BigDecimal money, @Param("status") Integer status);
}
