package com.example.springboot4.entity;

import com.example.springboot4.constant.FileCategoryEnum;
import lombok.Data;

/**
 * @author zzh
 * @date 2021年06月30日
 */

public class DemoDto {
    private String str;
    private FileCategoryEnum fileCategory;

    public DemoDto() {
    }

    public FileCategoryEnum getFileCategory() {
        return fileCategory;
    }

    public void setFileCategory(FileCategoryEnum fileCategory) {
        this.fileCategory = fileCategory;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
