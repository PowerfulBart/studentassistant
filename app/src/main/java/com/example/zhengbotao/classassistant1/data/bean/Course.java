package com.example.zhengbotao.classassistant1.data.bean;

import cn.bmob.v3.BmobObject;
import cn.bmob.v3.datatype.BmobRelation;

/**
 * Created by zhengbotao on 18-4-11.
 *
 * 课程实体类,包含 课程名,需要上该门课的班级 字段
 */

public class Course extends BmobObject{

    // 课程名
    private String courseName;

    // 需要上该门课的班级,多对多关系,一门课多个班上,一个班上多门课,用BmobRelation
    private BmobRelation className;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public BmobRelation getClassName() {
        return className;
    }

    public void setClassName(BmobRelation className) {
        this.className = className;
    }
}
