package com.example.springboot4.config;

import com.example.springboot4.constant.StringToEnumConverterFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author zzh
 * @date 2021年06月30日
 */
@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {

    /**
     * 注册枚举的类型转换器
     */
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverterFactory(new StringToEnumConverterFactory());
    }
}
