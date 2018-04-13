package com.example.zhengbotao.classassistant1.data.bean;

import cn.bmob.v3.datatype.BmobFile;

/**
 * Created by zhengbotao on 18-4-11.
 *
 * 学生实体类,继承自Author,包含 姓名,学号,密码,头像,学院,专业,班级 字段
 *
 *  Author包含了:
 *      用户名
 *      用户密码
 *      用户学号/工号
 *      用户头像
 */

public class AuthorStudent extends Author{

    // 学生所属学院
    private String stuAcademy;

    // 学生所学专业
    private String stuMajor;

    // 学生所在班级
    private ClassName stuBelongToClassName;

    public String getStuAcademy() {
        return stuAcademy;
    }

    public void setStuAcademy(String stuAcademy) {
        this.stuAcademy = stuAcademy;
    }

    public String getStuMajor() {
        return stuMajor;
    }

    public void setStuMajor(String stuMajor) {
        this.stuMajor = stuMajor;
    }

    public ClassName getStuBelongToClassName() {
        return stuBelongToClassName;
    }

    public void setStuBelongToClassName(ClassName stuBelongToClassName) {
        this.stuBelongToClassName = stuBelongToClassName;
    }
}
