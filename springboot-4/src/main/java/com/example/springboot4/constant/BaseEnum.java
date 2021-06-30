package com.example.springboot4.constant;

import java.util.EnumSet;

/**
 * @author zzh
 * @date 2021年06月30日
 */
public interface BaseEnum {

    int getValue();

    String getDesc();

    static <E extends Enum<E> & BaseEnum> E intToEnum(int value, Class<E> clazz) {
        EnumSet<E> enumSet = EnumSet.allOf(clazz);
        return enumSet.stream().filter(x -> value == x.getValue()).findFirst().orElse(null);
    }

    static <E extends Enum<E> & BaseEnum> E stringToEnum(String type, Class<E> clazz) {
        EnumSet<E> enumSet = EnumSet.allOf(clazz);
        return enumSet.stream().filter(x -> type.equals(""+ x.getValue())  || type.equals(x.getDesc())).findFirst().orElse(null);
    }
}
