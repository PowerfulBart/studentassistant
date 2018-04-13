package com.example.zhengbotao.classassistant1.data.bean;

import cn.bmob.v3.BmobObject;
import cn.bmob.v3.datatype.BmobDate;

/**
 * Created by zhengbotao on 18-4-11.
 *
 * 帖子实体类,包含 贴作者,贴标题,贴内容,贴类型,贴发布时间
 */

public class Post extends BmobObject{

    // 贴作者,一对一关系,用Pointer
    private Author postAuthor;

    // 贴标题
    private String postTitle;

    // 贴内容,仅限文字
    private String postContent;

    // 贴类型,为一标签,包括:提问,分享,作业
    private String postType;

    // 该贴发布时间,BmobDate类型(Bmob特有类型，用来标识日期类型)
    private BmobDate postTime;

    public Author getPostAuthor() {
        return postAuthor;
    }

    public void setPostAuthor(Author postAuthor) {
        this.postAuthor = postAuthor;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public BmobDate getPostTime() {
        return postTime;
    }

    public void setPostTime(BmobDate postTime) {
        this.postTime = postTime;
    }
}
