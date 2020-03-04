package com.dev.order.service;


import com.dev.order.dao.OrderDao;
import com.dev.order.entity.Orders;
import com.dev.order.feign.AccountApi;
import com.dev.order.feign.StorageApi;
import io.seata.spring.annotation.GlobalTransactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author IT云清
 */
@Service("orderServiceImpl")
public class OrderServiceImpl implements OrderService{

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderServiceImpl.class);

    @Autowired
    private OrderDao orderDao;
    @Autowired
    private StorageApi storageApi;
    @Autowired
    private AccountApi accountApi;

    /**
     * 创建订单
     * @param orders
     * @return
     * 测试结果：
     * 1.添加本地事务：仅仅扣减库存
     * 2.不添加本地事务：创建订单，扣减库存
     */
    @Override
    @GlobalTransactional(name = "fsp-create-order",rollbackFor = Exception.class)
    public void create(Orders orders) {
        LOGGER.info("------->交易开始");
        //本地方法
        orderDao.create(orders);

        //远程方法 扣减库存
        storageApi.decrease(orders.getProductId(), orders.getCount());

        //远程方法 扣减账户余额

        LOGGER.info("------->扣减账户开始order中");
        accountApi.decrease(orders.getUserId(), orders.getMoney());
        LOGGER.info("------->扣减账户结束order中");

        LOGGER.info("------->交易结束");
    }

    /**
     * 修改订单状态
     */
    @Override
    public void update(Integer userId,BigDecimal money,Integer status) {
        LOGGER.info("修改订单状态，入参为：userId={},money={},status={}",userId,money,status);
        orderDao.update(userId,money,status);
    }
}
