package com.example.springboot4.constant;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Get方法请求参数对应后端枚举类型，这个转换类可以实现字符到枚举的转换
 */
public class StringToEnumConverterFactory implements ConverterFactory<String, BaseEnum> {

    private static final Map<Class, Converter> converterMap = new HashMap<>();

    @Override
    public <T extends BaseEnum> Converter<String, T> getConverter(Class<T> targetType) {
        Converter<String, T> converter = converterMap.get(targetType);
        if(converter == null) {
            converter = new StringToEnumConverter<>(targetType);
            converterMap.put(targetType, converter);
        }
        return converter;
    }

    class StringToEnumConverter<T extends BaseEnum> implements Converter<String, T> {
        private Map<String, T> enumMap = new HashMap<>();

        StringToEnumConverter(Class<T> enumType) {
            T[] enums = enumType.getEnumConstants();
            for(T e : enums) {
                enumMap.put(String.valueOf(e.getValue()), e);
            }
        }

        @Override
        public T convert(String source) {
            T t = enumMap.get(source);
            if (t == null) {
                throw new IllegalArgumentException("No element matches " + source);
            }
            return t;
        }
    }

}

