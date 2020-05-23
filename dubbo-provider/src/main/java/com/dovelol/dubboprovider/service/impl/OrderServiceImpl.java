package com.dovelol.dubboprovider.service.impl;

import com.dovelol.dubboprovider.entity.Order;
import com.dovelol.dubboprovider.entity.User;
import com.dovelol.dubboprovider.interfaces.OrderService;
import com.dovelol.dubboprovider.interfaces.UserShareService;

/**
 * @author Dovelol
 * @date 2020/5/23 22:44
 */
public class OrderServiceImpl implements OrderService {

    @Override
    public Order getOrderByUserId(Long userId) {
        Order order = new Order();
        if(userId == 10L){
            order.setId(1L);
            order.setUserId(userId);
            order.setGoodsId(101L);
            order.setGoodsName("衣服");
            return order;
        }
        return null;
    }
}
