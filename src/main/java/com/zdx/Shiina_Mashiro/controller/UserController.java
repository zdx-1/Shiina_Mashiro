package com.zdx.Shiina_Mashiro.controller;


import com.zdx.Shiina_Mashiro.entity.User;
import com.zdx.Shiina_Mashiro.service.UserService;
import com.zdx.Shiina_Mashiro.utils.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 张德鑫
 * @since 2024-04-20
 */
@RestController
@RequestMapping("/user")
@Tag(name = "用户CRUD")
public class UserController {
    @Resource
    UserService userService;
    @Operation(summary = "登录",description = "用户登录")
    @PostMapping("/login")
    public Result<User> login(@RequestBody User user)
    {
        if (StringUtils.isBlank(user.getUsername()) || StringUtils.isBlank(user.getPassword())){
            return Result.error(Result.USER_LOGIN_ERROR,"用户名或密码不能为空");
        }
        return Result.success(userService.login(user),"登录成功");
    }
    @Operation(summary = "注册",description = "用户注册")
    @PostMapping("/register")
    public Result<User> register(@RequestBody User user)
    {
        if (StringUtils.isBlank(user.getUsername()) || StringUtils.isBlank(user.getPassword())){
            return Result.error(Result.USER_LOGIN_ERROR,"用户名或密码不能为空");
        }
        return Result.success(userService.register(user),"注册成功");
    }
}

