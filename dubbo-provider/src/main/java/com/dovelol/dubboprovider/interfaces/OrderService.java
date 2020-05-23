package com.dovelol.dubboprovider.interfaces;

import com.dovelol.dubboprovider.entity.Order;
import com.dovelol.dubboprovider.entity.User;

public interface OrderService {

    Order getOrderByUserId(Long id);


}
