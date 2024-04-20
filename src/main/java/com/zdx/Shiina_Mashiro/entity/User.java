package com.zdx.Shiina_Mashiro.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Value;

/**
 * <p>
 *
 * </p>
 *
 * @author 张德鑫
 * @since 2024-04-20
 */
@Getter
@Setter
@Accessors(chain = true)
@Schema(name = "User对象", description = "用户实体类")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String username;

    private String password;

    private String power;

    private String role;

    private String nickname;

    private String sex;

    private String avatar;

    private String address;

    private String introduce;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;


}
