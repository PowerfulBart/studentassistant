package com.example.zhengbotao.classassistant1.data.bean;

import cn.bmob.v3.datatype.BmobFile;
import cn.bmob.v3.datatype.BmobRelation;

/**
 * Created by zhengbotao on 18-4-11.
 *
 * 老师实体类,继承自Author,包含 姓名,工号,密码,头像,所授课程 字段
 *
 * Author包含了
 *      用户名
 *      用户密码
 *      用户学号/工号
 *      用户头像
 */

public class AuthorTeacher extends Author{

    // 老师需要教授的课程,多对多关系,一名老师可能教授多门课程,一门课程可能多名老师教授,用BmobRelation
    private BmobRelation teacherCourse;

    public BmobRelation getTeacherCourse() {
        return teacherCourse;
    }

    public void setTeacherCourse(BmobRelation teacherCourse) {
        this.teacherCourse = teacherCourse;
    }
}
