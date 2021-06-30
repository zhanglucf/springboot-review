package com.example.springboot4.constant;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author ZhangZhenhua
 * @date 2021/1/19 9:33
 */
public enum FileCategoryEnum implements BaseEnum {
    ICON(0, "p-icon", "头像、图片"),
    OPINION(1, "p-opinion", "个人或者专家意见表"),
    EXPERT_FEE(2, "p-expert_fee", "专家费用发放表"),
    SIGN(3, "p-sign", "专家签到表");

    private Integer value;
    private String desc;
    private String descCN;

    FileCategoryEnum() {}

    FileCategoryEnum(Integer value, String desc, String descCN) {
        this.value = value;
        this.desc = desc;
        this.descCN = descCN;
    }

    @JsonValue
    @Override
    public int getValue() {
        return this.value;
    }

    @Override
    public String getDesc() {
        return desc;
    }

    public static FileCategoryEnum intToEnum(int i) {
        FileCategoryEnum[] values = FileCategoryEnum.values();
        for (FileCategoryEnum fileCategoryEnum : values) {
            if (fileCategoryEnum.getValue() == i) {
                return fileCategoryEnum;
            }
        }
        return null;
    }

    @JsonCreator
    public static FileCategoryEnum create(Object obj) {
        String value = obj == null ? null: obj.toString();
        try {
            return FileCategoryEnum.valueOf(value);
        } catch (IllegalArgumentException e) {
            for (FileCategoryEnum fileCategoryEnum : FileCategoryEnum.values()) {
                try {
                    if (fileCategoryEnum.value == (Integer.parseInt(value))) {
                        return fileCategoryEnum;
                    }
                } catch (NumberFormatException n) {
                    if (fileCategoryEnum.desc.equals(value)) {
                        return fileCategoryEnum;
                    }
                }
            }
            throw new IllegalArgumentException("No element matches " + value);
        }

    }

    @Override
    public String toString() {
        return this.value + "";
    }
}

