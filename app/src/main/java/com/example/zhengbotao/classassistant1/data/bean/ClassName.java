package com.example.zhengbotao.classassistant1.data.bean;

import cn.bmob.v3.BmobObject;

/**
 * Created by zhengbotao on 18-4-11.
 *
 * 班级实体类,包含 班级名 字段
 */

public class ClassName extends BmobObject{

    private String className;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
