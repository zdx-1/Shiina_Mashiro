package com.zdx.Shiina_Mashiro.service.impl;

import com.zdx.Shiina_Mashiro.entity.User;
import com.zdx.Shiina_Mashiro.mapper.UserMapper;
import com.zdx.Shiina_Mashiro.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 张德鑫
 * @since 2024-04-20
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public User login(User user) {
        User user1 = userMapper.login(user);
        if (user1 != null) {
            user1.setPassword(null);
            return user1;
        }
        return null;
    }
    @Override
    public User register(User user) {
        User user1 = userMapper.login(user);
        if (user1 == null) {
            user.setId(null);
            user.setRole("正常");
            user.setPower("0");
            userMapper.insert(user);
            user.setPassword(null);
            return user;
        }
        return null;
    }
}
