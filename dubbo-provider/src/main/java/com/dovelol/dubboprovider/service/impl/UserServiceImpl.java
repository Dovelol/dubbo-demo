package com.dovelol.dubboprovider.service.impl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.InitializingBean;

import com.dovelol.dubboprovider.entity.User;
import com.dovelol.dubboprovider.interfaces.UserShareService;

/**
 * TODO 类实现描述
 *
 * @author yuanzheng
 * @since 2020年1月11日 下午2:05:07
 */
public class UserServiceImpl implements UserShareService, InitializingBean {

    Map<Long, User> userCacheMap = new ConcurrentHashMap<>();

    @Override
    public User getUserById(Long id) {
        return userCacheMap.get(id);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        User user1 = new User();
        user1.setId(1L);
        user1.setName("yzh1");
        User user2 = new User();
        user2.setId(2L);
        user2.setName("yzh2");
        User user3 = new User();
        user3.setId(3L);
        user3.setName("yzh3");
        userCacheMap.put(user1.getId(), user1);
        userCacheMap.put(user2.getId(), user2);
        userCacheMap.put(user3.getId(), user3);
    }
}
