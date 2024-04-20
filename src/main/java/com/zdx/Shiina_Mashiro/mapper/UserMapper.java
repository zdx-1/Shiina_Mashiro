package com.zdx.Shiina_Mashiro.mapper;

import com.zdx.Shiina_Mashiro.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.swagger.v3.oas.annotations.Operation;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 张德鑫
 * @since 2024-04-20
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    User login(@RequestBody User user);
}
