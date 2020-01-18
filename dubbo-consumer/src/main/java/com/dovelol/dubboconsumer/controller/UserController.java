package com.dovelol.dubboconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dovelol.dubboprovider.entity.User;
import com.dovelol.dubboprovider.interfaces.UserShareService;

/**
 * TODO 类实现描述
 *
 * @author yuanzheng
 * @since 2020年1月11日 下午2:23:08
 */
@RestController
public class UserController {

    @Autowired
    private UserShareService userService;

    @GetMapping("/getUser")
    @ResponseBody
    public User getUser(@RequestParam("id") Long id) {
        return userService.getUserById(id);
    }

}
