package com.zdx.Shiina_Mashiro.service;

import com.zdx.Shiina_Mashiro.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zdx.Shiina_Mashiro.utils.Result;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 张德鑫
 * @since 2024-04-20
 */
public interface UserService extends IService<User> {

    User login(User user);

    User register(User user);
}
