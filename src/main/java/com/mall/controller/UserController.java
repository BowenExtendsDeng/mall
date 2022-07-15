package com.mall.controller;

import com.mall.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author bowen
 * @since 2022-07-15
 */
@RestController
@RequestMapping("/mall/user")
public class UserController{
    @Autowired
    private IUserService userService;

    public Object index(){
        return userService.getById(1);
    }
}