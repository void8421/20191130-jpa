package com.zhou.jpa.controller;

import com.zhou.jpa.domain.User;
import com.zhou.jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author mac
 * @ClassName UserController
 * @Description
 * @Date 2019/11/30 5:48 下午
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<User> getUserList(){
        return userService.getUserList();
    }

    @GetMapping("/order")
    public List<User> getUserListOrderId(){
        return userService.getUserListOrderId();
    }

    @GetMapping("/orderAndPage")
    public List<User> findUserOrderByIdAndPage(){
        return userService.findUserOrderByIdAndPage();
    }

    @GetMapping("/page")
    public List<User> findUserByPage(){
        return userService.findUserByPage();
    }
}
