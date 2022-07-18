package com.mall.controller;

import com.mall.common.Result;
import com.mall.entity.User;
import com.mall.service.UserService;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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
    UserService userService;

    @RequiresAuthentication
    @GetMapping("/info")
    public Result info() {
        User user = userService.getById(1);
        return Result.success(user);
    }

    @PostMapping("save")
    public Result save(@Validated @RequestBody User user) {
        return Result.success(user);
    }
}
