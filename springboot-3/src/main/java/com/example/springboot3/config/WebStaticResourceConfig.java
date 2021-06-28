package com.example.springboot3.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author zzh
 * @date 2021年06月28日
 */
@Configuration
public class WebStaticResourceConfig extends WebMvcConfigurationSupport{

        @Override
        public void addResourceHandlers(ResourceHandlerRegistry registry) {
            registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
            registry.addResourceHandler("/tmp/**").addResourceLocations("file:\\D:\\resource\\");
        }

}
