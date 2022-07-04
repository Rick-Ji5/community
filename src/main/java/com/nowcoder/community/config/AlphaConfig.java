package com.nowcoder.community.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

// 配置类注解
@Configuration
public class AlphaConfig {

    @Bean
    // 返回的对象将被装到容器里
    public SimpleDateFormat simpleDateFormat() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }
}
