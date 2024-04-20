package com.zdx.oneruri.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Swagger配置
 * OpenApi生成接口文档，方便调试
 */

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI().info(new Info()
                .title("OneRuri OpenApi接口文档")
                .description("")
                .version("v1.0.0")
        );
    }
    @Bean
    public GroupedOpenApi homeApi() {
        return GroupedOpenApi.builder()
                .group("首页相关接口")
                .pathsToMatch("/home/")
                .build();
        //首页el-chart数据分析图什么的
    }
    @Bean
    public GroupedOpenApi menuApi() {
        return GroupedOpenApi.builder()
                .group("菜单相关接口")
                .pathsToMatch("/menu/**")
                .build();
        //菜单
        //根据用户类型不同进行对应的菜单数据返回
    }
    @Bean
    public GroupedOpenApi userApi() {
        return GroupedOpenApi.builder()
                .group("用户相关接口")
                .pathsToMatch("/user/**")
                .build();
        //用户注册登录
        //用户权限设置
    }
    @Bean
    public GroupedOpenApi fileApi() {
        return GroupedOpenApi.builder()
                .group("文件相关接口")
                .pathsToMatch("/file/**")
                .build();
    }
    @Bean
    public GroupedOpenApi productApi() {
        return GroupedOpenApi.builder()
                .group("商品相关接口")
                .pathsToMatch("/product/**")
                .build();
    }
    @Bean
    public GroupedOpenApi orderApi() {
        return GroupedOpenApi.builder()
                .group("订单相关接口")
                .pathsToMatch("/order/**")
                .build();
    }
    @Bean
    public GroupedOpenApi musicApi() {
        return GroupedOpenApi.builder()
                .group("音乐相关接口")
                .pathsToMatch("/music/**")
                .build();
    }
    @Bean
    public GroupedOpenApi videoApi() {
        return GroupedOpenApi.builder()
                .group("视频相关接口")
                .pathsToMatch("/video/**")
                .build();
    }



}
