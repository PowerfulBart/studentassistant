package com.example.zhengbotao.classassistant1.data.bean;

import cn.bmob.v3.BmobUser;
import cn.bmob.v3.datatype.BmobFile;

/**
 * Created by zhengbotao on 18-4-11.
 *
 * 用户父类,包括姓名,学号/工号,头像,密码 字段
 *
 * BmobUser 本身除BmobObject外,还包含
 *      username
 *      password   等属性,故这里不用重复声明
 */

public class Author extends BmobUser{

    // 用户学号/工号
    private String authorId;

    // 用户头像
    private BmobFile authorAvatar;

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public BmobFile getAuthorAvatar() {
        return authorAvatar;
    }

    public void setAuthorAvatar(BmobFile authorAvatar) {
        this.authorAvatar = authorAvatar;
    }
}
