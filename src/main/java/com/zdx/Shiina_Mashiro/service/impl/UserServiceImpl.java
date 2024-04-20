package com.zdx.Shiina_Mashiro.service.impl;

import com.zdx.Shiina_Mashiro.entity.User;
import com.zdx.Shiina_Mashiro.mapper.UserMapper;
import com.zdx.Shiina_Mashiro.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

}
